package kotlinfx.scene

import javafx.scene.Node
import javafx.scene.text.Text
import javafx.scene.text.TextFlow

inline fun text(text: String = "", x: Double, y: Double, initializer: Text.() -> Unit = {}): Text {
    return Text(x, y, text).apply(initializer)
}

inline fun textFlow(vararg children: Node, initializer: TextFlow.() -> Unit = {}): TextFlow {
    return TextFlow(*children).apply(initializer)
}

@JvmName("textFlowOfArray")
inline fun textFlow(children: Array<out Node>, initializer: TextFlow.() -> Unit = {}): TextFlow {
    return TextFlow(*children).apply(initializer)
}

inline fun textFlow(children: Collection<Node>, initializer: TextFlow.() -> Unit = {}): TextFlow {
    return TextFlow().apply { this.children.addAll(children) }.apply(initializer)
}