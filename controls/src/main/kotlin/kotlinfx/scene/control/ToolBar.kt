package kotlinfx.scene.control

import javafx.scene.Node
import javafx.scene.control.ToolBar

inline fun toolBar(vararg items: Node, initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar(*items).apply(initializer)
}

@JvmName("menuBarOfArray")
inline fun toolBar(items: Array<out Node>, initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar(*items).apply(initializer)
}

inline fun toolBar(items: Collection<Node>, initializer: ToolBar.() -> Unit = {}): ToolBar {
    return ToolBar().apply { this.items.addAll(items) }.apply(initializer)
}
