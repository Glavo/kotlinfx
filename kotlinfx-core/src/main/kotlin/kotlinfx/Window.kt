package kotlinfx

import javafx.event.EventHandler

typealias Window = javafx.stage.Window
typealias WindowEvent = javafx.stage.WindowEvent

inline fun Window.onCloseRequest(crossinline v: (WindowEvent) -> Unit) {
    this.onCloseRequest = EventHandler { v(it) }
}

inline fun Window.onHidden(crossinline v: (WindowEvent) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun Window.onHiding(crossinline v: (WindowEvent) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun Window.onShowing(crossinline v: (WindowEvent) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun Window.onShown(crossinline v: (WindowEvent) -> Unit) {
    this.onShown = EventHandler { v(it) }
}

