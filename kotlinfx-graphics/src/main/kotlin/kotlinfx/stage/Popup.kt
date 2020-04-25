package kotlinfx.stage

import javafx.stage.Popup

inline fun popup(initializer: Popup.() -> Unit = {}): Popup {
    return Popup().apply(initializer)
}