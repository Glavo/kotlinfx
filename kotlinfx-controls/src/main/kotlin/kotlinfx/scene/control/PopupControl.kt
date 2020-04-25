package kotlinfx.scene.control

import javafx.scene.control.PopupControl

inline fun popupControl(initializer: PopupControl.() -> Unit = {}): PopupControl {
    return PopupControl().apply(initializer)
}