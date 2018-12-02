package edb.frame;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.CertificateErrorParams;
import com.teamdev.jxbrowser.chromium.LoadHandler;
import com.teamdev.jxbrowser.chromium.LoadParams;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import edb.editor.basic.MenuProvider;
import esl.lib.ESLVal;

public class HTMLFileTab extends JPanel implements EDBMenuProvider, LoadHandler {

	File		file;
	Browser	browser	= new Browser();

	public HTMLFileTab(File file) {
		setLayout(new BorderLayout());
		BrowserView browserView = new BrowserView(browser);
		add(browserView, BorderLayout.CENTER);
		setSize(700, 500);
		setVisible(true);
		browser.loadURL("file:" + file.getAbsolutePath());
		browser.setLoadHandler(this);
	}

	public void addMenu(JMenuBar bar) {
		JButton back = MenuProvider.getImageButton("icons/back.png", "back", KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.META_MASK), () -> {
			back();
		});
		bar.add(back);
		JButton forward = MenuProvider.getImageButton("icons/forward.png", "forward", () -> {
			forward();
		});
		bar.add(forward);
		JButton reload = MenuProvider.getImageButton("icons/reload.png", "reload", () -> {
			reload();
		});
		bar.add(reload);
	}

	private void back() {
		if (browser.canGoBack()) browser.goBack();
	}

	private void forward() {
		if (browser.canGoForward()) browser.goForward();
	}

	private void reload() {
		 browser.reload();
	}

	public void addButton(String label, JButton button) {

	}

	public boolean onCertificateError(CertificateErrorParams arg0) {
		return false;
	}

	public boolean onLoad(LoadParams params) {
		if (params.getURL().startsWith("esl:")) {
			String path = params.getURL().substring(4);
			EDBFrame.FRAME.load(new File(path));
			return true;
		} else if (params.getURL().startsWith("edb:")) {
			String path = params.getURL().substring(4);
			for (ESLVal v : EDBFrame.FRAME.getBrowserListeners()) {
				v.actor.send(new ESLVal("BrowserEvent",new ESLVal(path)));
			}
			return true;
		} else
			return false;
	}
}