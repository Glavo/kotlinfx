package kotlinfx.scene.control

import javafx.scene.control.ButtonBar

inline fun buttonBar(buttonOrder: String? = null, initializer: ButtonBar.() -> Unit = {}): ButtonBar {
    return ButtonBar(buttonOrder).apply(initializer)
}