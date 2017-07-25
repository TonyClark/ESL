package edb.editor;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class Filmstrip extends JPanel implements ChangeListener {

  Vector<String> filmstrip;
  JSlider        slider;
  Browser        browser = new Browser();
  BrowserView    view    = new BrowserView(browser);

  public Filmstrip(Vector<String> filmstrip) {
    this.filmstrip = filmstrip;
    if (!filmstrip.isEmpty()) {
      slider = new JSlider(JSlider.HORIZONTAL, 0, filmstrip.size() - 1, 1);
      setLayout(new BorderLayout());
      browser.loadHTML(filmstrip.get(0));
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

  public Vector<String> getFilmstrip() {
    return filmstrip;
  }

  public void setFilmstrip(Vector<String> filmstrip) {
    this.filmstrip = filmstrip;
  }

  public void stateChanged(ChangeEvent e) {
    browser.loadHTML(filmstrip.get(slider.getValue()));
  }

}
