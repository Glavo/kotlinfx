package kotlinfx.scene.control

import javafx.scene.control.Alert
import javafx.scene.control.ButtonType

inline fun alert(alertType: Alert.AlertType, contextText: String = "", vararg buttons: ButtonType, initializer: Alert.() -> Unit = {}): Alert {
    return Alert(alertType, contextText, *buttons).apply(initializer)
}

@JvmName("alertOfButtonArray")
inline fun alert(alertType: Alert.AlertType, contextText: String = "", buttons: Array<out ButtonType>, initializer: Alert.() -> Unit = {}): Alert {
    return Alert(alertType, contextText, *buttons).apply(initializer)
}

inline fun alert(alertType: Alert.AlertType, contextText: String = "", buttons: Collection<ButtonType>, initializer: Alert.() -> Unit = {}): Alert {
    return Alert(alertType, contextText, *buttons.toTypedArray()).apply(initializer)
}