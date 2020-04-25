package kotlinfx.scene.control

import javafx.scene.Node
import javafx.scene.control.ScrollPane

inline fun scrollPane(context: Node? = null, initializer: ScrollPane.() -> Unit = {}): ScrollPane {
    return ScrollPane(context).apply(initializer)
}