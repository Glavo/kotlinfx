package kotlinfx.scene.control

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.ButtonBase

inline fun button(text: String = "", graphic: Node? = null, initializer: Button .() -> Unit = {}): Button {
    return Button(text).apply { if (graphic != null) this.graphic = graphic }.apply(initializer)
}

inline fun ButtonBase.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}