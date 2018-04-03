package kotlinfx.scene.control

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.TextField

inline fun textField(text: String = "", initializer: TextField.() -> Unit = {}): TextField {
    return TextField(text).apply(initializer)
}

inline fun TextField.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}