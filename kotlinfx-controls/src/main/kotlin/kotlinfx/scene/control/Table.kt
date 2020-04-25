package kotlinfx.scene.control

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.EventHandler
import javafx.scene.control.*

inline fun <T> tableView(vararg items: T, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("choiceBoxOfArray")
inline fun <T> tableView(items: Array<out T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> tableView(items: Collection<T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> tableView(items: List<T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> tableView(items: ObservableList<T>, initializer: TableView<T>.() -> Unit = {}): TableView<T> {
    return TableView<T>(items).apply(initializer)
}

inline fun TableView<*>.onScrollTo(crossinline v: (ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

inline fun <T> TableView<T>.onScrollToColumn(crossinline v: (ScrollToEvent<TableColumn<T, *>>) -> Unit) {
    this.onScrollToColumn = EventHandler { v(it) }
}

inline fun <S, T> tableCell(initializer: TableCell<S, T>.() -> Unit = {}): TableCell<S, T> {
    return TableCell<S, T>().apply(initializer)
}

inline fun <S, T> tableColumn(text: String = "", initializer: TableColumn<S, T>.() -> Unit = {}): TableColumn<S, T> {
    return TableColumn<S, T>(text).apply(initializer)
}

inline fun <T> tableRow(initializer: TableRow<T>.() -> Unit = {}): TableRow<T> {
    return TableRow<T>().apply(initializer)
}

inline fun <S, T> TableView<S>.tablePosition(row: Int, tableColumn: TableColumn<S, T>, initializer: TablePosition<S, T>.() -> Unit = {}): TablePosition<S, T> {
    return TablePosition<S, T>(this, row, tableColumn).apply(initializer)
}

inline fun <S, T> TableColumn<S, T>.onEditStart(crossinline v: (TableColumn.CellEditEvent<S, T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <S, T> TableColumn<S, T>.onEditCommit(crossinline v: (TableColumn.CellEditEvent<S, T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <S, T> TableColumn<S, T>.onEditCancel(crossinline v: (TableColumn.CellEditEvent<S, T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}