package kotlinfx.scene.control

import javafx.scene.control.RadioButton

inline fun radioButton(text: String = "", initializer: RadioButton.() -> Unit = {}): RadioButton {
    return RadioButton(text).apply(initializer)
}