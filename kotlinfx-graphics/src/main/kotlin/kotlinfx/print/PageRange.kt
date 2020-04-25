@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.print

import javafx.print.PageRange

inline fun pageRange(startPage: Int, endPage: Int): PageRange = PageRange(startPage, endPage)

inline fun pageRange(range: IntRange): PageRange = PageRange(range.first, range.last)

inline fun IntRange.toPageRange(): PageRange = PageRange(this.first, this.last)

inline operator fun PageRange.component1(): Int = this.startPage
inline operator fun PageRange.component2(): Int = this.endPage