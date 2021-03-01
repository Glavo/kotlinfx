package kotlinfx

typealias Popup = javafx.stage.Popup
typealias PopupWindow = javafx.stage.PopupWindow
typealias PopupControl = javafx.scene.control.PopupControl

inline fun popup(initializer: Popup.() -> Unit = {}): Popup {
    return Popup().apply(initializer)
}

inline fun popupControl(initializer: PopupControl.() -> Unit = {}): PopupControl {
    return PopupControl().apply(initializer)
}