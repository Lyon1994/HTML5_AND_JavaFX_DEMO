/*
 * Copyright (c) 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package cn.wion.wifimax.cloverserver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import cn.wion.wifimax.cloverserver.gui.WebViewPane;

/**
 * Demonstrates a WebView object accessing a web page.
 *
 * @see javafx.scene.web.WebView
 * @see javafx.scene.web.WebEngine
 */
public class CloverServerManager extends Application {
	public static String resource_path = CloverServerManager.class.getResource(
			"/").toString();

	@Override
	public void start(Stage primaryStage) throws Exception {
//		primaryStage.setFullScreen(false);
//		primaryStage.setResizable(false);
//		primaryStage.setIconified(true);
		primaryStage.setTitle("E掌柜服务端管理程序");
		primaryStage.getIcons().add(new Image(resource_path+"img/icon.png"));
//		primaryStage.initStyle(StageStyle.DECORATED);
		Pane root = new WebViewPane();
		primaryStage.setScene(new Scene(root, 900, 550));
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	/**
	 * The main() method is ignored in correctly deployed JavaFX application.
	 * main() serves only as fallback in case the application can not be
	 * launched through deployment artifacts, e.g., in IDEs with limited FX
	 * support. NetBeans ignores main().
	 *
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// File file = new File("./webapp/test.jj");
		// try {
		// file.createNewFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// System.out.println(CloverServerManager.class.getResource("/"));
		launch(args);
	}

}
