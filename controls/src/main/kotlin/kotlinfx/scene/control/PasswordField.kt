package kotlinfx.scene.control

import javafx.scene.control.PasswordField

inline fun passwordField(initializer: PasswordField.() -> Unit = {}): PasswordField {
    return PasswordField().apply(initializer)
}