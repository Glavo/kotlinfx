package kotlinfx.scene.control

import javafx.geometry.Orientation
import javafx.scene.control.Separator

inline fun separator(orientation: Orientation = Orientation.HORIZONTAL, initializer: Separator.() -> Unit = {}): Separator {
    return Separator(orientation).apply(initializer)
}