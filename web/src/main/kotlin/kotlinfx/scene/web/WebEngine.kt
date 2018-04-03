@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.scene.web

import javafx.event.EventHandler
import javafx.geometry.Rectangle2D
import javafx.scene.web.WebEngine
import javafx.scene.web.WebErrorEvent
import javafx.scene.web.WebEvent

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