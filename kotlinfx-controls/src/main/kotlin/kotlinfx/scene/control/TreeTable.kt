package kotlinfx.scene.control

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.EventHandler
import javafx.scene.control.*

inline fun <T> treeTableView(root: TreeItem<T>? = null, initializer: TreeTableView<T>.() -> Unit = {}): TreeTableView<T> {
    return TreeTableView<T>(root).apply(initializer)
}

inline fun TreeTableView<*>.onScrollTo(crossinline v: (ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

inline fun <T> TreeTableView<T>.onSort(crossinline v: (SortEvent<TreeTableView<T>>) -> Unit) {
    this.onSort = EventHandler { v(it) }
}

inline fun <T> TreeTableView<T>.onScrollToColumn(crossinline v: (ScrollToEvent<TreeTableColumn<T, *>>) -> Unit) {
    this.onScrollToColumn = EventHandler { v(it) }
}

inline fun <S, T> treeTableCell(initializer: TreeTableCell<S, T>.() -> Unit = {}): TreeTableCell<S, T> {
    return TreeTableCell<S, T>().apply(initializer)
}

inline fun <S, T> treeTreeTableColumn(text: String = "", initializer: TreeTableColumn<S, T>.() -> Unit = {}): TreeTableColumn<S, T> {
    return TreeTableColumn<S, T>(text).apply(initializer)
}

inline fun <T> treeTableRow(initializer: TreeTableRow<T>.() -> Unit = {}): TreeTableRow<T> {
    return TreeTableRow<T>().apply(initializer)
}

inline fun <S, T> TreeTableView<S>.treeTablePosition(row: Int, tableColumn: TreeTableColumn<S, T>, initializer: TreeTablePosition<S, T>.() -> Unit = {}): TreeTablePosition<S, T> {
    return TreeTablePosition<S, T>(this, row, tableColumn).apply(initializer)
}


inline fun <S, T> TreeTableColumn<S, T>.onEditStart(crossinline v: (TreeTableColumn.CellEditEvent<S, T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <S, T> TreeTableColumn<S, T>.onEditCommit(crossinline v: (TreeTableColumn.CellEditEvent<S, T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <S, T> TreeTableColumn<S, T>.onEditCancel(crossinline v: (TreeTableColumn.CellEditEvent<S, T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}
