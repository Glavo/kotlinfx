@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias Collation = javafx.print.Collation

//region PageRange

typealias PageRange = javafx.print.PageRange

inline fun pageRange(startPage: Int, endPage: Int): PageRange = PageRange(startPage, endPage)

inline fun pageRange(range: IntRange): PageRange = PageRange(range.first, range.last)

inline fun IntRange.toPageRange(): PageRange = PageRange(this.first, this.last)

/**
 * @see javafx.print.PageRange.startPage
 */
inline operator fun PageRange.component1(): Int = this.startPage

/**
 * @see javafx.print.PageRange.endPage
 */
inline operator fun PageRange.component2(): Int = this.endPage

//endregion

typealias JobSettings = javafx.print.JobSettings

typealias PageLayout = javafx.print.PageLayout

typealias Paper = javafx.print.Paper
typealias PaperSource = javafx.print.PaperSource
typealias PrintResolution = javafx.print.PrintResolution

typealias PageOrientation = javafx.print.PageOrientation
typealias PrintColor = javafx.print.PrintColor
typealias PrintQuality = javafx.print.PrintQuality
typealias PrintSides = javafx.print.PrintSides