package cn.wion.wifimax.cloverserver.listener;

import javax.jws.WebMethod;

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

	@WebMethod
	public void exit() {
		System.exit(0);
	}

	public void login() {
		System.out.println("login...");
	}
	
}
