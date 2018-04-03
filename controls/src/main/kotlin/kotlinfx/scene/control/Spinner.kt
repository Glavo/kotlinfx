package kotlinfx.scene.control

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.control.Spinner

inline fun <T> spinner(min: Int, max: Int, initialValue: Int, amountToStepBy: Int = 1, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner<T>(min, max, initialValue, amountToStepBy).apply(initializer)
}

inline fun <T> spinner(min: Double, max: Double, initialValue: Double, amountToStepBy: Double = 1.0, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner<T>(min, max, initialValue, amountToStepBy).apply(initializer)
}

inline fun <T> spinner(vararg items: T, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableArrayList(*items)).apply(initializer)
}

@JvmName("spinnerOfArray")
inline fun <T> spinner(items: Array<out T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableArrayList(*items)).apply(initializer)
}

inline fun <T> spinner(items: Collection<T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableList(items.toList())).apply(initializer)
}

inline fun <T> spinner(items: List<T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner(FXCollections.observableList(items)).apply(initializer)
}

inline fun <T> spinner(items: ObservableList<T>, initializer: Spinner<T>.() -> Unit = {}): Spinner<T> {
    return Spinner<T>(items).apply(initializer)
}