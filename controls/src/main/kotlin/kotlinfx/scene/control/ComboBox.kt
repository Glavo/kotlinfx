package kotlinfx.scene.control

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.ActionEvent
import javafx.event.Event
import javafx.event.EventHandler
import javafx.scene.control.ComboBox
import javafx.scene.control.ComboBoxBase

inline fun <T> comboBox(vararg items: T, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("comboBoxOfArray")
inline fun <T> comboBox(items: Array<out T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> comboBox(items: Collection<T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> comboBox(items: List<T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> comboBox(items: ObservableList<T>, initializer: ComboBox<T>.() -> Unit = {}): ComboBox<T> {
    return ComboBox<T>(items).apply(initializer)
}

inline fun ComboBoxBase<*>.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onHidden(crossinline v: (Event) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onHiding(crossinline v: (Event) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onShowing(crossinline v: (Event) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun ComboBoxBase<*>.onShown(crossinline v: (Event) -> Unit) {
    this.onShown = EventHandler { v(it) }
}
