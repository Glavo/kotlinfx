@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import java.util.*
import kotlin.NoSuchElementException


//region Collections

typealias FXCollections = javafx.collections.FXCollections

typealias ObservableList<E> = javafx.collections.ObservableList<E>
typealias ObservableSet<E> = javafx.collections.ObservableSet<E>
typealias ObservableMap<K, V> = javafx.collections.ObservableMap<K, V>


inline fun <K, V> Map<K, V>.observable(): ObservableMap<K, V> = FXCollections.observableMap(this)

inline fun <E> Set<E>.observable(): ObservableSet<E> = FXCollections.observableSet(this)


inline fun <E> observableListOf(): ObservableList<E> = FXCollections.emptyObservableList()

inline fun <E> observableListOf(e: E): ObservableList<E> = FXCollections.singletonObservableList(e)

inline fun <E> observableListOf(vararg items: E): ObservableList<E> = FXCollections.observableArrayList(*items).unmodifiable()

inline fun <E> observableMutableListOf(vararg items: E): ObservableList<E> = FXCollections.observableArrayList(*items)

inline fun <K, V> observableMapOf(): ObservableMap<K, V> = FXCollections.emptyObservableMap()

inline fun <K, V> observableMapOf(vararg items: Pair<K, V>): ObservableMap<K, V> = mapOf(*items).observable().unmodifiable()

inline fun <K, V> observableMutableMapOf(vararg items: Pair<K, V>): ObservableMap<K, V> = hashMapOf(*items).observable()

inline fun <E> observableSetOf(): ObservableSet<E> = FXCollections.emptyObservableSet()

inline fun <E> observableSetOf(vararg e: E): ObservableSet<E> = FXCollections.observableSet(*e).unmodifiable()

inline fun <E> observableMutableSetOf(vararg items: E): ObservableSet<E> = FXCollections.observableSet(*items)

inline fun <E> List<E>.asObservableList(): ObservableList<E> {
    return FXCollections.observableList(this)
}

inline fun <E> Set<E>.asObservableSet(): ObservableSet<E> {
    return FXCollections.observableSet(this)
}

inline fun <K, V> Map<K, V>.asObservableMap(): ObservableMap<K, V> {
    return FXCollections.observableMap(this)
}

inline fun <E> ObservableList<E>.synchronized(): ObservableList<E> = FXCollections.synchronizedObservableList(this)

inline fun <K, V> ObservableMap<K, V>.synchronized(): ObservableMap<K, V> = FXCollections.synchronizedObservableMap(this)

inline fun <E> ObservableSet<E>.synchronized(): ObservableSet<E> = FXCollections.synchronizedObservableSet(this)

inline fun <reified E> ObservableList<E>.checked(): ObservableList<E> = FXCollections.checkedObservableList(this, E::class.java)

inline fun <reified K, reified V> ObservableMap<K, V>.checked(): ObservableMap<K, V> =
        FXCollections.checkedObservableMap(this, K::class.java, V::class.java)

inline fun <reified E> ObservableSet<E>.checked(): ObservableSet<E> = FXCollections.checkedObservableSet(this, E::class.java)

inline fun <E> ObservableList<E>.unmodifiable(): ObservableList<E> = FXCollections.unmodifiableObservableList(this)

inline fun <K, V> ObservableMap<K, V>.unmodifiable(): ObservableMap<K, V> = FXCollections.unmodifiableObservableMap(this)

inline fun <E> ObservableSet<E>.unmodifiable(): ObservableSet<E> = FXCollections.unmodifiableObservableSet(this)

//endregion

//region ObservableArray

typealias ObservableArray<T> = javafx.collections.ObservableArray<T>
typealias ObservableArrayBase<T> = javafx.collections.ObservableArrayBase<T>
typealias ObservableFloatArray = javafx.collections.ObservableFloatArray
typealias ObservableIntegerArray = javafx.collections.ObservableIntegerArray

inline fun observableFloatArrayOf(vararg values: Float): ObservableFloatArray = FXCollections.observableFloatArray(*values)

@JvmName("observableFloatArrayOfArray")
inline fun observableFloatArrayOf(values: FloatArray): ObservableFloatArray = FXCollections.observableFloatArray(*values)

inline fun observableIntegerArrayOf(vararg values: Int): ObservableIntegerArray = FXCollections.observableIntegerArray(*values)

@JvmName("observableIntegerArrayOfArray")
inline fun observableIntegerArrayOf(values: IntArray): ObservableIntegerArray = FXCollections.observableIntegerArray(*values)

operator fun ObservableFloatArray.iterator(): Iterator<Float> = object : Iterator<Float> {
    private var idx = 0

    override fun hasNext(): Boolean = idx != this@iterator.size()

    override fun next(): Float = try {
        this@iterator[idx++]
    } catch (e: ArrayIndexOutOfBoundsException) {
        throw NoSuchElementException(e.message)
    }
}

inline fun ObservableFloatArray.forEach(op: (Float) -> Unit) {
    val size = this.size()
    var idx = 0
    while (idx < size) {
        op(this[idx++])
    }
}

inline fun ObservableFloatArray.forEachIndexed(op: (index: Int, Float) -> Unit) {
    val size = this.size()
    var idx = 0
    while (idx < size) {
        op(idx, this[idx++])
    }
}

/**
 * Returns an array containing copy of the observable array.
 */
inline fun ObservableFloatArray.toArray(): FloatArray = this.toArray(null)

inline fun ObservableFloatArray.asList(): List<Float> = object : AbstractMutableList<Float>() {
    override val size: Int
        get() = this@asList.size()

    /**
     * Returns the element at the specified index in the list.
     */
    override fun get(index: Int): Float = this@asList[index]

    override fun set(index: Int, element: Float): Float {
        val oldValue = this@asList[index]
        this@asList[index] = element
        return oldValue
    }

    override fun iterator(): MutableIterator<Float> = object : MutableIterator<Float> {
        private var idx = 0

        override fun hasNext(): Boolean = idx != this@asList.size()

        override fun next(): Float = try {
            this@asList[idx++]
        } catch (e: ArrayIndexOutOfBoundsException) {
            throw NoSuchElementException(e.message)
        }

        override fun remove() {
            throw UnsupportedOperationException()
        }
    }

    override fun add(index: Int, element: Float) {
        throw UnsupportedOperationException()
    }

    override fun removeAt(index: Int): Float {
        throw UnsupportedOperationException()
    }

}

inline operator fun ObservableFloatArray.plusAssign(elements: FloatArray) {
    this.addAll(*elements)
}

inline operator fun ObservableFloatArray.plusAssign(elements: ObservableFloatArray) {
    this.addAll(elements)
}

operator fun ObservableIntegerArray.iterator(): PrimitiveIterator.OfInt = object : PrimitiveIterator.OfInt {
    private var idx = 0

    override fun hasNext(): Boolean = idx != this@iterator.size()

    override fun nextInt(): Int = try {
        this@iterator[idx++]
    } catch (e: ArrayIndexOutOfBoundsException) {
        throw NoSuchElementException()
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}

inline fun ObservableIntegerArray.forEach(op: (Int) -> Unit) {
    val size = this.size()
    var idx = 0
    while (idx < size) {
        op(this[idx++])
    }
}

inline fun ObservableIntegerArray.forEachIndexed(op: (index: Int, Int) -> Unit) {
    val size = this.size()
    var idx = 0
    while (idx < size) {
        op(idx, this[idx++])
    }
}

/**
 * Returns an array containing copy of the observable array.
 */
inline fun ObservableIntegerArray.toArray(): IntArray = this.toArray(null)

inline fun ObservableIntegerArray.asList(): List<Int> = object : AbstractMutableList<Int>() {
    override val size: Int
        get() = this@asList.size()

    /**
     * Returns the element at the specified index in the list.
     */
    override fun get(index: Int): Int = this@asList[index]

    override fun set(index: Int, element: Int): Int {
        val oldValue = this@asList[index]
        this@asList[index] = element
        return oldValue
    }

    override fun iterator(): MutableIterator<Int> = this@asList.iterator()

    override fun add(index: Int, element: Int) {
        throw UnsupportedOperationException()
    }

    override fun removeAt(index: Int): Int {
        throw UnsupportedOperationException()
    }
}

inline operator fun ObservableIntegerArray.plusAssign(elements: IntArray) {
    this.addAll(*elements)
}

inline operator fun ObservableIntegerArray.plusAssign(elements: ObservableIntegerArray) {
    this.addAll(elements)
}

//endregion