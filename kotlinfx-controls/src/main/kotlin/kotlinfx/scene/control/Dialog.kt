package kotlinfx.scene.control

import javafx.event.Event
import javafx.event.EventHandler
import javafx.scene.control.Dialog
import javafx.scene.control.DialogEvent

inline fun <R> dialog(initializer: Dialog<R>.() -> Unit = {}): Dialog<R> {
    return Dialog<R>().apply(initializer)
}

inline fun Dialog<*>.onHidden(crossinline v: (DialogEvent) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun Dialog<*>.onHiding(crossinline v: (DialogEvent) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun Dialog<*>.onShowing(crossinline v: (DialogEvent) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun Dialog<*>.onShown(crossinline v: (DialogEvent) -> Unit) {
    this.onShown = EventHandler { v(it) }
}

inline fun Dialog<*>.onCloseRequest(crossinline v: (DialogEvent) -> Unit) {
    this.onCloseRequest = EventHandler { v(it) }
}
