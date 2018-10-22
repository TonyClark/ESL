package edb.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserContext;
import com.teamdev.jxbrowser.chromium.BrowserContextParams;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

public class HTMLTab extends JPanel implements HyperlinkListener, EDBMenuProvider {

	public static BrowserContext	context	= new BrowserContext(new BrowserContextParams(new File("./docs").getAbsolutePath()));

	Browser												browser	= new Browser(context);

	HTMLTab(String html) {
		this();
		setHTML(html);
	}

	HTMLTab() {
		BrowserView view = new BrowserView(browser);
		view.setAutoscrolls(true);
		browser.setContextMenuHandler((params) -> {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					JPopupMenu popup = popup(browser);
					if (browser.canGoBack()) {
						JMenuItem back = new JMenuItem("Back");
						back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								browser.goBack();
							}
						});
						popup.add(back);
					}
					if (browser.canGoForward()) {
						JMenuItem forward = new JMenuItem("Forward");
						forward.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								browser.goForward();
							}
						});
						popup.add(forward);
					}
					popup.show(view, params.getLocation().x, params.getLocation().y);
				}
			});
		});
		setLayout(new BorderLayout());
		add(view);
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
		JMenuItem html = new JMenuItem("Save HTML");
		html.addActionListener((e) -> {
			String HTML = browser.getHTML();
			JFileChooser chooser = new JFileChooser();
			int retrival = chooser.showSaveDialog(null);
			if (retrival == JFileChooser.APPROVE_OPTION) {
				try {
					FileWriter fw = new FileWriter(chooser.getSelectedFile());
					fw.write(HTML);
					fw.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		popup.add(html);
		return popup;
	}

	public void hyperlinkUpdate(HyperlinkEvent e) {
	}

	public void addMenu(JMenuBar bar) {

	}

	public void setHTML(String html) {
		browser.loadHTML(html);
	}

	public void addButton(String label, JButton button) {

	}

}
