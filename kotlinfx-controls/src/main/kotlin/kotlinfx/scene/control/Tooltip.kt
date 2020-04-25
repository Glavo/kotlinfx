package kotlinfx.scene.control

import javafx.scene.control.Tooltip

inline fun tooltip(text: String, initializer: Tooltip .() -> Unit = {}): Tooltip {
    return Tooltip(text).apply(initializer)
}