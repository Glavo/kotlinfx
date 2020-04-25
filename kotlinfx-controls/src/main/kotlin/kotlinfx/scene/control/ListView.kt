package kotlinfx.scene.control

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.EventHandler
import javafx.scene.control.ListCell
import javafx.scene.control.ListView
import javafx.scene.control.ScrollToEvent

inline fun <T> listView(vararg items: T, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("listViewOfArray")
inline fun <T> listView(items: Array<out T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> listView(items: Collection<T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> listView(items: List<T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> listView(items: ObservableList<T>, initializer: ListView<T>.() -> Unit = {}): ListView<T> {
    return ListView<T>(items).apply(initializer)
}


inline fun <T> ListView<T>.onEditStart(crossinline v: (ListView.EditEvent<T>) -> Unit) {
    this.onEditStart = EventHandler { v(it) }
}

inline fun <T> ListView<T>.onEditCommit(crossinline v: (ListView.EditEvent<T>) -> Unit) {
    this.onEditCommit = EventHandler { v(it) }
}

inline fun <T> ListView<T>.onEditCancel(crossinline v: (ListView.EditEvent<T>) -> Unit) {
    this.onEditCancel = EventHandler { v(it) }
}

inline fun ListView<*>.onScrollTo(crossinline v: (ScrollToEvent<Int>) -> Unit) {
    this.onScrollTo = EventHandler { v(it) }
}

inline fun <T> listCell(initializer: ListCell<T>.() -> Unit = {}): ListCell<T> {
    return ListCell<T>().apply(initializer)
}