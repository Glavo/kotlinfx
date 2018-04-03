@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.geometry

import javafx.geometry.Bounds

inline operator fun Bounds.contains(p: Pair<Double, Double>): Boolean = this.contains(p.first, p.second)

inline operator fun Bounds.contains(p: Triple<Double, Double, Double>): Boolean = this.contains(p.first, p.second, p.third)