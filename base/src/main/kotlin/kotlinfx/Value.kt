@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.beans.InvalidationListener
import javafx.beans.Observable
import javafx.beans.value.*
import kotlin.reflect.KProperty

inline fun Observable.onInvalidate(crossinline op: (Observable) -> Unit): Subscription {
    val l = InvalidationListener { op(it) }
    this.addListener(l)
    return Subscription {
        this.removeListener(l)
    }
}

inline fun <T> ObservableValue<T>.onChange(
        crossinline listener: (observable: ObservableValue<out T>, oldValue: T, newValue: T) -> Unit): Subscription {
    val l: ChangeListener<T> = ChangeListener { observable, oldValue, newValue -> listener(observable, oldValue, newValue) }
    this.addListener(l)
    return Subscription {
        this.removeListener(l)
    }
}

inline operator fun ObservableBooleanValue.getValue(thisRef: Any?, property: KProperty<*>): Boolean {
    return this.get()
}

inline operator fun ObservableFloatValue.getValue(thisRef: Any?, property: KProperty<*>): Float {
    return this.get()
}

inline operator fun ObservableDoubleValue.getValue(thisRef: Any?, property: KProperty<*>): Double {
    return this.get()
}

inline operator fun ObservableIntegerValue.getValue(thisRef: Any?, property: KProperty<*>): Int {
    return this.get()
}

inline operator fun ObservableLongValue.getValue(thisRef: Any?, property: KProperty<*>): Long {
    return this.get()
}

inline operator fun ObservableNumberValue.getValue(thisRef: Any?, property: KProperty<*>): Number {
    return this.value
}


inline operator fun <T> ObservableObjectValue<T>.getValue(thisRef: Any?, property: KProperty<*>): T {
    return this.get()
}


inline operator fun WritableBooleanValue.setValue(thisRef: Any?, property: KProperty<*>, value: Boolean) {
    this.set(value)
}

inline operator fun WritableFloatValue.setValue(thisRef: Any?, property: KProperty<*>, value: Float) {
    this.set(value)
}

inline operator fun WritableDoubleValue.setValue(thisRef: Any?, property: KProperty<*>, value: Double) {
    this.set(value)
}

inline operator fun WritableIntegerValue.setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
    this.set(value)
}

inline operator fun WritableLongValue.setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
    this.set(value)
}

inline operator fun <T> WritableObjectValue<T>.setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    this.set(value)
}
