package cn.wion.wifimax.cloverserver.listener;

import javafx.scene.web.WebView;
/**
 * js监听器
 * @author Administrator
 *
 */
public class ListenerJS {
	@SuppressWarnings("unused")
	private WebView webView = null;

	public ListenerJS(WebView webView) {
		this.webView = webView;
	}

	public void exit() {
		System.exit(0);
	}

	public void login() {
		System.out.println("login...");
	}
	
}
