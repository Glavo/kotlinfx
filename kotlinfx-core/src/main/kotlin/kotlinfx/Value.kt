@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import kotlin.reflect.KProperty

typealias Observable = javafx.beans.Observable
typealias ObservableValue<T> = javafx.beans.value.ObservableValue<T>
typealias ObservableValueBase<T> = javafx.beans.value.ObservableValueBase<T>
typealias ObservableBooleanValue = javafx.beans.value.ObservableBooleanValue
typealias ObservableNumberValue = javafx.beans.value.ObservableNumberValue
typealias ObservableIntegerValue = javafx.beans.value.ObservableIntegerValue
typealias ObservableLongValue = javafx.beans.value.ObservableLongValue
typealias ObservableFloatValue = javafx.beans.value.ObservableFloatValue
typealias ObservableDoubleValue = javafx.beans.value.ObservableDoubleValue
typealias ObservableObjectValue<T> = javafx.beans.value.ObservableObjectValue<T>
typealias ObservableStringValue = javafx.beans.value.ObservableStringValue
typealias ObservableListValue<E> = javafx.beans.value.ObservableListValue<E>
typealias ObservableSetValue<E> = javafx.beans.value.ObservableSetValue<E>
typealias ObservableMapValue<K, V> = javafx.beans.value.ObservableMapValue<K, V>

typealias WritableValue<T> = javafx.beans.value.WritableValue<T>
typealias WritableBooleanValue = javafx.beans.value.WritableBooleanValue
typealias WritableNumberValue = javafx.beans.value.WritableNumberValue
typealias WritableIntegerValue = javafx.beans.value.WritableIntegerValue
typealias WritableLongValue = javafx.beans.value.WritableLongValue
typealias WritableFloatValue = javafx.beans.value.WritableFloatValue
typealias WritableDoubleValue = javafx.beans.value.WritableDoubleValue
typealias WritableObjectValue<T> = javafx.beans.value.WritableObjectValue<T>
typealias WritableStringValue = javafx.beans.value.WritableStringValue
typealias WritableListValue<E> = javafx.beans.value.WritableListValue<E>
typealias WritableSetValue<E> = javafx.beans.value.WritableSetValue<E>
typealias WritableMapValue<K, V> = javafx.beans.value.WritableMapValue<K, V>

typealias ChangeListener<T> = javafx.beans.value.ChangeListener<T>
typealias WeakChangeListener<T> = javafx.beans.value.WeakChangeListener<T>

inline fun Observable.onInvalidate(crossinline op: (Observable) -> Unit): Subscription {
    val l = InvalidationListener { op(it) }
    this.addListener(l)
    return Subscription {
        this.removeListener(l)
    }
}

/**
 * @see javafx.beans.value.ObservableValue.addListener
 */
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
