@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.geometry

typealias Dimension = javafx.geometry.Dimension2D

inline fun dimension(width: Double, height: Double): Dimension = Dimension(width, height)

inline operator fun Dimension.component1(): Double = this.width
inline operator fun Dimension.component2(): Double = this.height