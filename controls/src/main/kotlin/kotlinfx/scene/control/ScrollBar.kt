package kotlinfx.scene.control

import javafx.scene.control.ScrollBar

inline fun scrollBar(initializer: ScrollBar.() -> Unit = {}): ScrollBar {
    return ScrollBar().apply(initializer)
}