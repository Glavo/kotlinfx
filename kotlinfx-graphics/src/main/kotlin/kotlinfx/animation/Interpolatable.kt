@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.animation

import javafx.animation.Interpolatable

inline operator fun <T> Interpolatable<T>.invoke(endValue: T, t: Double): T = this.interpolate(endValue, t)