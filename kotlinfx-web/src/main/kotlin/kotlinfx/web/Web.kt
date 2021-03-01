@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.web

import javafx.geometry.Rectangle2D
import javafx.event.EventHandler
import javafx.scene.web.PromptData

typealias HTMLEditor = javafx.scene.web.HTMLEditor

typealias WebEngine = javafx.scene.web.WebEngine
typealias WebView = javafx.scene.web.WebView
typealias WebHistory = javafx.scene.web.WebHistory

typealias WebEvent<T> = javafx.scene.web.WebEvent<T>
typealias WebErrorEvent = javafx.scene.web.WebErrorEvent

typealias PopupFeatures = javafx.scene.web.PopupFeatures
typealias PromptData = javafx.scene.web.PromptData

inline fun webView(initializer: WebView.() -> Unit = {}): WebView = WebView().apply(initializer)

inline fun htmlEditor(initializer: HTMLEditor.() -> Unit = {}): HTMLEditor = HTMLEditor().apply(initializer)

inline fun webEngine(url: String? = null, initializer: WebEngine.() -> Unit = {}): WebEngine =
        WebEngine(url).apply(initializer)

inline fun WebEngine.onAlert(crossinline v: (WebEvent<String>) -> Unit) {
    this.onAlert = EventHandler { v(it) }
}

inline fun WebEngine.onStatusChanged(crossinline v: (WebEvent<String>) -> Unit) {
    this.onStatusChanged = EventHandler { v(it) }
}

inline fun WebEngine.onResized(crossinline v: (WebEvent<Rectangle2D>) -> Unit) {
    this.onResized = EventHandler { v(it) }
}

inline fun WebEngine.onVisibilityChanged(crossinline v: (WebEvent<Boolean>) -> Unit) {
    this.onVisibilityChanged = EventHandler { v(it) }
}

inline fun WebEngine.onError(crossinline v: (WebErrorEvent) -> Unit) {
    this.onError = EventHandler { v(it) }
}

inline infix fun WebEngine.eval(script: String): Any? = this.executeScript(script)

inline fun promptData(message: String, defaultValue: String, initializer: PromptData.() -> Unit): PromptData {
    return PromptData(message, defaultValue).apply(initializer)
}

