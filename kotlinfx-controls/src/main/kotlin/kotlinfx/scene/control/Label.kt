package kotlinfx.scene.control

import javafx.scene.Node
import javafx.scene.control.Label

inline fun label(text: String = "", graphic: Node? = null, initializer: Label .() -> Unit = {}): Label {
    return Label(text).apply { if (graphic != null) this.graphic = graphic }.apply(initializer)
}