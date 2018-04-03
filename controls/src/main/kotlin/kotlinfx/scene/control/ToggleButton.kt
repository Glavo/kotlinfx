package kotlinfx.scene.control

import javafx.scene.Node
import javafx.scene.control.ToggleButton

inline fun toggleButton(text: String = "", graphic: Node? = null, initializer: ToggleButton.() -> Unit = {}): ToggleButton {
    return ToggleButton(text, graphic).apply(initializer)
}