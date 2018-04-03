package kotlinfx.scene.control

import javafx.scene.Node
import javafx.scene.control.Hyperlink

inline fun hyperlink(text: String = "", graphic: Node? = null, initializer: Hyperlink.() -> Unit = {}): Hyperlink {
    return Hyperlink(text, graphic).apply(initializer)
}