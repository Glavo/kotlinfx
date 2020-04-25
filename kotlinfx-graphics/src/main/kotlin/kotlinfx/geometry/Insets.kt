@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.geometry

import javafx.geometry.Insets

inline fun insets(top: Double, right: Double, bottom: Double, left: Double): Insets = Insets(top, right, bottom, left)

inline fun insets(top: Int, right: Int, bottom: Int, left: Int): Insets =
        Insets(top.toDouble(), right.toDouble(), bottom.toDouble(), left.toDouble())