@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.print

import javafx.print.PageRange

inline fun pageRange(startPage: Int, endPage: Int): PageRange = PageRange(startPage, endPage)

inline fun pageRange(range: IntRange): PageRange = PageRange(range.start, range.endInclusive)

inline fun IntRange.toPageRange(): PageRange = PageRange(this.start, this.endInclusive)

inline operator fun PageRange.component1(): Int = this.startPage
inline operator fun PageRange.component2(): Int = this.endPage