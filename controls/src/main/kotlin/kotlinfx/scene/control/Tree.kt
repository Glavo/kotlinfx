package kotlinfx.scene.control

import javafx.event.EventHandler
import javafx.scene.Node
import javafx.scene.control.*

inline fun <T> treeView(root: TreeItem<T>? = null, initializer: TreeView<T>.() -> Unit = {}): TreeView<T> {
    return TreeView(root).apply(initializer)
}

inline fun <T> treeItem(value: T? = null, graphic: Node? = null, initializer: TreeItem<T>.() -> Unit = {}): TreeItem<T> {
    return TreeItem<T>(value, graphic).apply(initializer)
}

inline fun <T> treeCell(initializer: TreeCell<T>.() -> Unit = {}): TreeCell<T> {
    return TreeCell<T>().apply(initializer)
}

inline fun <T> checkBoxTreeItem(
        value: T? = null,
        graphic: Node? = null,
        selected: Boolean = false,
        independent: Boolean = false,
        initializer: CheckBoxTreeItem<T>.() -> Unit = {}): CheckBoxTreeItem<T> {
    return CheckBoxTreeItem<T>(value, graphic, selected, independent).apply(initializer)
}

inline fun <T> TreeView<T>.onEditStart(crossinline v: (TreeView.EditEvent<T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <T> TreeView<T>.onEditCommit(crossinline v: (TreeView.EditEvent<T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <T> TreeView<T>.onEditCancel(crossinline v: (TreeView.EditEvent<T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}

inline fun TreeView<*>.onScrollTo(crossinline v: (ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}