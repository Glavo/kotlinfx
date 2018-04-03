@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.scene.control

import javafx.scene.control.IndexRange

inline fun indexRange(start: Int, end: Int, initializer: IndexRange.() -> Unit = {}): IndexRange {
    return IndexRange(start, end).apply(initializer)
}

inline fun indexRange(range: IndexRange, initializer: IndexRange.() -> Unit = {}): IndexRange {
    return IndexRange(range).apply(initializer)
}

inline fun indexRange(range: IntRange, initializer: IndexRange.() -> Unit = {}): IndexRange {
    return range.toIndexRange().apply(initializer)
}

inline fun IndexRange.toIntRange(): IntRange = start until end

inline fun IntRange.toIndexRange(): IndexRange = IndexRange(first, last + 1)