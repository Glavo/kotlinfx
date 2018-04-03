@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.geometry

import javafx.geometry.BoundingBox

inline fun boundingBox(minX: Double, minY: Double, minZ: Double, width: Double, height: Double, depth: Double): BoundingBox {
    return BoundingBox(minX, minY, minZ, width, height, depth)
}

inline fun boundingBox(minX: Int, minY: Int, minZ: Int, width: Int, height: Int, depth: Int): BoundingBox {
    return BoundingBox(minX.toDouble(), minY.toDouble(), minZ.toDouble(), width.toDouble(), height.toDouble(), depth.toDouble())
}

inline fun boundingBox(minX: Double, minY: Double, width: Double, height: Double): BoundingBox {
    return BoundingBox(minX, minY, width, height)
}

inline fun boundingBox(minX: Int, minY: Int, width: Int, height: Int): BoundingBox {
    return BoundingBox(minX.toDouble(), minY.toDouble(), width.toDouble(), height.toDouble())
}