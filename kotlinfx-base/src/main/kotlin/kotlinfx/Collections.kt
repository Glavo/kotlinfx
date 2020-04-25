@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.beans.Observable
import javafx.collections.*

// Collections

inline fun <E> List<E>.observable(): ObservableList<E> = FXCollections.observableList(this)

inline fun <E> List<E>.observable(crossinline extractor: (E) -> Array<Observable>): ObservableList<E> {
    return FXCollections.observableList(this) { extractor(it) }
}

inline fun <K, V> Map<K, V>.observable(): ObservableMap<K, V> = FXCollections.observableMap(this)

inline fun <E> Set<E>.observable(): ObservableSet<E> = FXCollections.observableSet(this)


inline fun <E> observableListOf(): ObservableList<E> = FXCollections.emptyObservableList()

inline fun <E> observableListOf(e: E): ObservableList<E> = FXCollections.singletonObservableList(e)

inline fun <E> observableListOf(vararg items: E): ObservableList<E> = listOf(*items).observable().unmodifiable()

inline fun <E> observableMutableListOf(vararg items: E): ObservableList<E> = FXCollections.observableArrayList(*items)

inline fun <K, V> observableMapOf(): ObservableMap<K, V> = FXCollections.emptyObservableMap()

inline fun <K, V> observableMapOf(vararg items: Pair<K, V>): ObservableMap<K, V> = mapOf(*items).observable().unmodifiable()

inline fun <K, V> observableMutableMapOf(vararg items: Pair<K, V>): ObservableMap<K, V> = hashMapOf(*items).observable()

inline fun <E> observableSetOf(): ObservableSet<E> = FXCollections.emptyObservableSet()

inline fun <E> observableSetOf(vararg e: E): ObservableSet<E> = setOf(*e).observable()

inline fun <E> observableMutableSetOf(vararg items: E): ObservableSet<E> = FXCollections.observableSet(*items)


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


// ObservableFloatArray

inline fun observableFloatArrayOf(vararg values: Float): ObservableFloatArray = FXCollections.observableFloatArray(*values)

@JvmName("observableFloatArrayOfArray")
inline fun observableFloatArrayOf(values: FloatArray): ObservableFloatArray = FXCollections.observableFloatArray(*values)

inline fun FloatArray.observable(): ObservableFloatArray = FXCollections.observableFloatArray(*this)


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

inline fun ObservableFloatArray.toArray(): FloatArray = this.toArray(null)

inline fun ObservableFloatArray.asList(): List<Float> = object : AbstractList<Float>() {
    override val size: Int
        get() = this@asList.size()

    /**
     * Returns the element at the specified index in the list.
     */
    override fun get(index: Int): Float = this@asList[index]

    override fun iterator(): Iterator<Float> = this@asList.iterator()

}


inline operator fun ObservableFloatArray.plusAssign(elements: FloatArray) {
    this.addAll(*elements)
}

inline operator fun ObservableFloatArray.plusAssign(elements: ObservableFloatArray) {
    this.addAll(elements)
}

// ObservableIntegerArray

inline fun observableIntegerArrayOf(vararg values: Int): ObservableIntegerArray = FXCollections.observableIntegerArray(*values)

@JvmName("observableIntegerArrayOfArray")
inline fun observableIntegerArrayOf(values: IntArray): ObservableIntegerArray = FXCollections.observableIntegerArray(*values)

inline fun IntArray.observable(): ObservableIntegerArray = FXCollections.observableIntegerArray(*this)


operator fun ObservableIntegerArray.iterator(): Iterator<Int> = object : Iterator<Int> {
    private var idx = 0

    override fun hasNext(): Boolean = idx != this@iterator.size()

    override fun next(): Int = try {
        this@iterator[idx++]
    } catch (e: ArrayIndexOutOfBoundsException) {
        throw NoSuchElementException()
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

inline fun ObservableIntegerArray.toArray(): IntArray = this.toArray(null)

inline fun ObservableIntegerArray.asList(): List<Int> = object : AbstractList<Int>() {
    override val size: Int
        get() = this@asList.size()

    /**
     * Returns the element at the specified index in the list.
     */
    override fun get(index: Int): Int = this@asList[index]

    override fun iterator(): Iterator<Int> = this@asList.iterator()

}


inline operator fun ObservableIntegerArray.plusAssign(elements: IntArray) {
    this.addAll(*elements)
}

inline operator fun ObservableIntegerArray.plusAssign(elements: ObservableIntegerArray) {
    this.addAll(elements)
}