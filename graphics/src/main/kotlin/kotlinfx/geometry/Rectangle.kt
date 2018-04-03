@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.geometry

import javafx.geometry.Rectangle2D

inline fun rectangle2d(minX: Double, minY: Double, width: Double, height: Double): Rectangle2D =
        Rectangle2D(minX, minY, width, height)

inline fun rectangle2d(minX: Int, minY: Int, width: Int, height: Int): Rectangle2D =
        Rectangle2D(minX.toDouble(), minY.toDouble(), width.toDouble(), height.toDouble())

inline operator fun Rectangle2D.contains(p: Pair<Double, Double>): Boolean = this.contains(p.first, p.second)
