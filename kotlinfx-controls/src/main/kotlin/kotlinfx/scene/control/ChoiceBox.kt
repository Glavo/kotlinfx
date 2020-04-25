package kotlinfx.scene.control

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.*
import javafx.scene.control.ChoiceBox

inline fun <T> choiceBox(vararg items: T, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("choiceBoxOfArray")
inline fun <T> choiceBox(items: Array<out T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> choiceBox(items: Collection<T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> choiceBox(items: List<T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> choiceBox(items: ObservableList<T>, initializer: ChoiceBox<T>.() -> Unit = {}): ChoiceBox<T> {
    return ChoiceBox<T>(items).apply(initializer)
}

inline fun ChoiceBox<*>.onAction(crossinline v: (ActionEvent) -> Unit) {
    this.onAction = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onHidden(crossinline v: (Event) -> Unit) {
    this.onHidden = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onHiding(crossinline v: (Event) -> Unit) {
    this.onHiding = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onShowing(crossinline v: (Event) -> Unit) {
    this.onShowing = EventHandler { v(it) }
}

inline fun ChoiceBox<*>.onShown(crossinline v: (Event) -> Unit) {
    this.onShown = EventHandler { v(it) }
}
