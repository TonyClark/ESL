package edb.editor;

import java.io.IOException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import edb.tool.EDB;

public class HTMLViewer extends JEditorPane implements HyperlinkListener {

  String path;
  EDB    edb;

  public HTMLViewer(String path, EDB edb) throws IOException {
    super();
    this.path = path;
    this.edb = edb;
    setContentType("text/html");
    setEditable(false);
    setPage(new URL(path));
    addHyperlinkListener(this);
  }

  public void hyperlinkUpdate(HyperlinkEvent e) {
    if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
      URL url = e.getURL();
      String path = url.getFile();
      edb.openFile(path);
    }
  }
}
