@file:Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")

package kotlinfx

typealias JFXPair<K, V> = javafx.util.Pair<K, V>

inline fun <K, V> JFXPair<out K, out V>.toKotlin(): Pair<K, V> = Pair(this.key, this.value)

inline fun <K, V> Pair<K, V>.toJFX(): JFXPair<K, V> = JFXPair(this.first, this.second)

inline fun <K, V> JFXPair<out K, out V>.narrow(): JFXPair<K, V> = this as JFXPair<K, V>

inline fun <K, V> pair(key: K, value: V): JFXPair<K, V> = JFXPair(key, value)

inline operator fun <T> JFXPair<out T, *>.component1(): T = this.key

inline operator fun <T> JFXPair<*, out T>.component2(): T = this.value

inline fun <T> JFXPair<out T, out T>.toList(): List<T> = listOf(this.key, this.value)
