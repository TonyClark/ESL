package edb.editor.filmstrip;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.ContextMenuHandler;
import com.teamdev.jxbrowser.chromium.ContextMenuParams;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import edb.tool.DelayedString;

public class Filmstrip extends JPanel implements ChangeListener, Runnable {

  private final int     FAST    = 1;
  private final int     MEDIUM  = 100;
  private final int     SLOW    = 1000;

  Vector<DelayedString> filmstrip;
  JSlider               slider;
  Browser               browser = new Browser();
  BrowserView           view    = new BrowserView(browser);
  boolean               running = false;

  public Filmstrip(Vector<DelayedString> filmstrip) {
    this.filmstrip = filmstrip;
    setSlider();
    setMenu();
    new Thread(this).start();
  }

  public void run() {
    for (DelayedString d : filmstrip)
      d.getString();
  }

  private void setMenu() {
    browser.setContextMenuHandler(new ContextMenuHandler() {
      public void showContextMenu(ContextMenuParams params) {
        JPopupMenu popup = popup(browser);
        if (!running) {
          JMenu run = new JMenu("Run");
          JMenuItem fast = new JMenuItem("Fast");
          JMenuItem medium = new JMenuItem("Medium");
          JMenuItem slow = new JMenuItem("Slow");
          runAction(fast, FAST);
          runAction(medium, MEDIUM);
          runAction(slow, SLOW);
          run.add(slow);
          run.add(medium);
          run.add(fast);
          popup.add(run);
        } else {
          JMenuItem stop = new JMenuItem("Stop");
          stop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              running = false;
            }
          });
          popup.add(stop);
        }
        popup.show(view, params.getLocation().x, params.getLocation().y);
      }
    });
  }

  private void runAction(JMenuItem item, int delay) {
    item.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        runFilmstrip(delay);
      }
    });
  }

  private synchronized void runFilmstrip(int delay) {
    if (!running) {
      running = true;
      new Thread(new Runnable() {
        public void run() {
          try {
            while (running) {
              if (slider.getValue() >= (filmstrip.size() - 1))
                slider.setValue(0);
              else slider.setValue(slider.getValue() + 1);
              synchronized (Filmstrip.this) {
                Filmstrip.this.wait(delay);
              }
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }).start();
    }
  }

  private JPopupMenu popup(Browser browser) {
    JPopupMenu popup = new JPopupMenu();
    JMenuItem print = new JMenuItem("Print");
    print.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        browser.print();
      }
    });
    popup.add(print);
    return popup;
  }

  private void setSlider() {
    if (!filmstrip.isEmpty()) {
      slider = new JSlider(JSlider.HORIZONTAL, 0, filmstrip.size() - 1, 0);
      setLayout(new BorderLayout());
      browser.loadHTML(filmstrip.get(0).getString());
      add(view, BorderLayout.CENTER);
      add(slider, BorderLayout.SOUTH);
      slider.addChangeListener(this);
      slider.setMajorTickSpacing(10);
      slider.setMinorTickSpacing(1);
      slider.setPaintTicks(true);
      slider.setPaintLabels(true);
      slider.setFont(getSliderFont());
    }
  }

  private Font getSliderFont() {
    if (filmstrip.size() < 100)
      return new Font("Consolas", Font.PLAIN, 10);
    else if (filmstrip.size() < 300)
      return new Font("Consolas", Font.PLAIN, 7);
    else return new Font("Consolas", Font.PLAIN, 5);
  }

  public Vector<DelayedString> getFilmstrip() {
    return filmstrip;
  }

  public void setFilmstrip(Vector<DelayedString> filmstrip) {
    this.filmstrip = filmstrip;
  }

  public void stateChanged(ChangeEvent e) {
    Browser.invokeAndWaitFinishLoadingMainFrame(browser, (b) -> browser.loadHTML(filmstrip.get(slider.getValue()).getString()));
  }

}
