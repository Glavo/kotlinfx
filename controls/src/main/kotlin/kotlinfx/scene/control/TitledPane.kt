package kotlinfx.scene.control

import javafx.scene.Node
import javafx.scene.control.TitledPane

inline fun titledPane(title: String = "", context: Node? = null, initializer: TitledPane.() -> Unit = {}): TitledPane {
    return TitledPane(title, context).apply(initializer)
}