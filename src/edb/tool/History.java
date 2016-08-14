package edb.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

import actors.Actor;
import actors.Behaviour;
import actors.Dynamic;
import actors.Message;
import list.List;

public class History {

  private final static String    osName        = System.getProperty("os.name").replaceAll("\\s", "");

  private static String          cfgProp;

  private static Properties      configFile;

  private static String          TEMP_DIR;

  private static String          DOT;

  String                         URL           = "";
  private int[]                  dpiSizes      = { 46, 51, 57, 63, 70, 78, 86, 96, 106, 116, 128, 141, 155, 170, 187, 206, 226, 249 };

  /**
   * Define the index in the image size array.
   */
  private int                    currentDpiPos = 1;

  Hashtable<Actor, ActorHistory> actors        = new Hashtable<Actor, ActorHistory>();

  public History() {
    cfgProp = "config/config.properties";
    configFile = new Properties() {
      private final static long serialVersionUID = 1L;

      {
        try {
          load(new FileInputStream(cfgProp));
        } catch (Exception e) {
          System.err.println(e);
        }
      }
    };
    TEMP_DIR = configFile.getProperty("tempDirFor" + osName);
    DOT = configFile.getProperty("dotFor" + osName);
    // DOT = configFile.getProperty("neatoFor" + osName);
    // DOT = configFile.getProperty("circoFor" + osName);
  }

  private String actorLabel(Actor a, Behaviour b) {
    return "\"" + b.getName() + "(" + a.getId() + ")\"";
  }

  public void addMessage(Actor source, Actor target, Message message, int time) {
    if (actors.containsKey(target)) {
      ActorHistory history = actors.get(target);
      history.addMessage(new ActorMessage(source, message, time));
    } else System.err.println("Cannot find history for " + target);
  }

  public void behaviourChanged(Actor actor, Behaviour oldBehaviour, Behaviour newBehaviour, int time) {
    if (actors.containsKey(actor)) {
      actors.get(actor).behaviourChanged(newBehaviour, oldBehaviour, time);
    } else System.err.println("Cannot find actor " + actor);
  }

  private byte[] get_img_stream(File dot, String type, String representationType) {
    File img;
    byte[] img_stream = null;

    try {
      img = File.createTempFile("graph_", "." + type, new File(TEMP_DIR));
      Runtime rt = Runtime.getRuntime();

      // patch by Mike Chenault
      // representation type with -K argument by Olivier Duplouy
      String[] args = { DOT, "-T" + type, "-K" + representationType, "-Gdpi=" + dpiSizes[this.currentDpiPos], dot.getAbsolutePath(), "-o", img.getAbsolutePath() };
      Process p = rt.exec(args);
      p.waitFor();

      FileInputStream in = new FileInputStream(img.getAbsolutePath());
      img_stream = new byte[in.available()];
      in.read(img_stream);
      // Close it if we need to
      if (in != null) in.close();

      if (img.delete() == false) System.err.println("Warning: " + img.getAbsolutePath() + " could not be deleted!");
    } catch (java.io.IOException ioe) {
      System.err.println("Error:    in I/O processing of tempfile in dir " + TEMP_DIR + "\n");
      System.err.println("       or in calling external command");
      ioe.printStackTrace();
    } catch (java.lang.InterruptedException ie) {
      System.err.println("Error: the execution of the external program was interrupted");
      ie.printStackTrace();
    }

    return img_stream;
  }

  public String getDotSource(int actorStart, int actorEnd, int messageStart, int messageEnd) {
    String s = "digraph G { \n";
    s = s + "  graph[rankdir=LR, center=true, nodesep=0.1, ranksep=0.3, ratio=compress, repulsiveforce=0.1]";
    // s = s + " node[shape=circle, fontname=\"Courier-Bold\", fontsize=10, width=0.4, height=0.4]";
    s = s + "  edge[arrowsize=0.6, arrowhead=vee]";
    for (Actor a : actors.keySet())
      if (actorStart <= actors.get(a).getBirthTime() && actors.get(a).getBirthTime() <= actorEnd) {
        for (Behaviour b : actors.get(a).getBehaviours())
          s = s + "   " + actorLabel(a, b) + "[shape=circle];\n";
        // s = s + " " + actorLabel(a) + "[pos=\"" + (x*10) + "," + (y*10) + "!\"];\n";
      }
    for (Actor a : actors.keySet()) {
      s = s + actors.get(a).behaviourChangeArrows();
    }
    for (ActorHistory h : actors.values()) {
      if (actorStart <= h.getBirthTime() && h.getBirthTime() <= actorEnd) {
        for (ActorMessage m : h.getMessages()) {
          int time = m.getTimeSent();
          if (messageStart <= time && time <= messageEnd) {
            String label = m.getHTMLLabel();
            s = s + "  " + actors.get(m.getSource()).labelAt(time) + " -> " + actors.get(h.getActor()).labelAt(time) + "[label=<" + label + ">];\n";
          }
        }
      }
    }
    s = s + "}";
    return s;
  }

  private String getDotSource(Vector<Actor> actors) {
    String s = "digraph G { \n";
    s = s + "  graph[rankdir=LR, center=true, nodesep=0.1, ranksep=0.3, ratio=compress, repulsiveforce=0.1]";
    for (Actor a : actors) {
      s = s + "   " + actorLabel(a, a.getBehaviour()) + "[shape=circle];\n";
    }
    for (Actor a : actors) {
      List<Dynamic> dynamics = a.getBehaviour().getDynamics();
      String[] names = a.getBehaviour().getCode().getDynamicNames(0);
      int index = 0;
      while (!dynamics.isNil()) {
        String name = names[index++];
        Dynamic d = dynamics.getHead();
        dynamics = dynamics.getTail();
        Object o = d.getValue();
        s = s + addActorEdge(a, o, name, 5);
      }
    }
    s = s + "}";
    return s;
  }

  private String addActorEdge(Actor a, Object o, String name, int listLimit) {
    String s = "";
    if (o instanceof Actor) {
      Actor b = (Actor) o;
      s = s + "  " + actorLabel(a, a.getBehaviour()) + " -> " + actorLabel(b, b.getBehaviour()) + "[label=\"" + name + "\"];\n";
    } else if (o instanceof List) {
      List<Object> l = (List<Object>) o;
      if (l.length() <= listLimit) {
        while (!l.isNil() && listLimit > 0) {
          s = s + addActorEdge(a, l.getHead(), name, listLimit);
          l = l.getTail();
        }
      }
    }
    return s;
  }

  public byte[] getGraph(String dot_source, String type, String representationType) {
    File dot;
    byte[] img_stream = null;
    try {
      dot = writeDotSourceToFile(dot_source);
      if (dot != null) {
        img_stream = get_img_stream(dot, type, representationType);
        if (dot.delete() == false) System.err.println("Warning: " + dot.getAbsolutePath() + " could not be deleted!");
        return img_stream;
      }
      return null;
    } catch (java.io.IOException ioe) {
      return null;
    }
  }

  public String getString(int actorStart, int actorEnd, int messageStart, int messageEnd) {
    String s = new String(getGraph(getDotSource(actorStart, actorEnd, messageStart, messageEnd), "svg", "dot"));
    int i = s.indexOf("<svg");
    if (i >= 0)
      return s.substring(i);
    else return "";
  }

  public String getString(Vector<Actor> actors) {
    // Return an SVG representation of the actor graph...

    String s = new String(getGraph(getDotSource(actors), "svg", "dot"));
    int i = s.indexOf("<svg");
    if (i >= 0)
      return s.substring(i);
    else return "";
  }

  public int maxTime() {
    int max = 0;
    for (ActorHistory h : actors.values()) {
      for (ActorMessage m : h.getMessages()) {
        max = Math.max(max, m.getTimeSent());
      }
    }
    return max;
  }

  public void newActor(Actor actor, int time) {
    actors.put(actor, new ActorHistory(actor, time));
  }

  public void reset() {
    actors.clear();
  }

  private File writeDotSourceToFile(String str) throws java.io.IOException {
    File temp;
    try {
      temp = File.createTempFile("graph_", ".dot.tmp", new File(TEMP_DIR));
      FileWriter fout = new FileWriter(temp);
      fout.write(str);
      fout.close();
    } catch (Exception e) {
      System.err.println("Error: I/O error while writing the dot source to temp file!");
      return null;
    }
    return temp;
  }

}
