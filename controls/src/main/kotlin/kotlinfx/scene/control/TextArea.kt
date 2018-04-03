package kotlinfx.scene.control

import javafx.scene.control.TextArea

inline fun textArea(text: String = "", initializer: TextArea.() -> Unit = {}): TextArea {
    return TextArea(text).apply(initializer)
}