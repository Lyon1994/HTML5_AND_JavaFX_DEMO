package cn.wion.wifimax.cloverserver.manager;

import javafx.scene.web.WebView;
import netscape.javascript.JSObject;
import cn.wion.wifimax.cloverserver.listener.ListenerJS;

/**
 * 自定义JavaScript内置对象
 * 
 * @author Lyon_Yan time：2015-06-17 16:33:34
 */
public class JSManager {
	public static JSObject binding(WebView webView) {
		/**
		 * html调用js（固定的不可动）
		 */
		JSObject jsObject = (JSObject) webView.getEngine().executeScript(
				"window");// 获取js对象
		jsObject.setMember("app", new ListenerJS(webView));// 然后把应用程序对象设置成为js对象
		return jsObject;
	}
}
