package kotlinfx.scene.control

import javafx.scene.control.CheckBox

inline fun checkBox(text: String = "", initializer: CheckBox.() -> Unit = {}): CheckBox {
    return CheckBox(text).apply(initializer)
}