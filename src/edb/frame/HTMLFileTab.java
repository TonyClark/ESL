package edb.frame;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class HTMLFileTab extends JPanel implements HyperlinkListener, EDBMenuProvider {

	File file;

	public HTMLFileTab(File file) {
		Browser browser = new Browser();
		setLayout(new BorderLayout());
		BrowserView browserView = new BrowserView(browser);
		add(browserView, BorderLayout.CENTER);
		setSize(700, 500);
		setVisible(true);
		browser.loadURL("file:" + file.getAbsolutePath());
	}

	public void hyperlinkUpdate(HyperlinkEvent e) {
	}

	public void addMenu(JMenuBar bar) {
	}

	public void addButton(String label, JButton button) {
		
	}
}