package kotlinfx.scene.web

import javafx.scene.web.WebView

inline fun webView(initializer: WebView.() -> Unit = {}): WebView = WebView().apply(initializer)