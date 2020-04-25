package kotlinfx.scene.control

import javafx.scene.control.TextInputDialog

inline fun textInputDialog(defaultValue: String = "", initializer: TextInputDialog.() -> Unit = {}): TextInputDialog {
    return TextInputDialog(defaultValue).apply(initializer)
}