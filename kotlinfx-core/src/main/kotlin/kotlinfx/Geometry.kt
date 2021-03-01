@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias Side = javafx.geometry.Side
typealias Pos = javafx.geometry.Pos
typealias HPos = javafx.geometry.HPos
typealias VPos = javafx.geometry.VPos
typealias NodeOrientation = javafx.geometry.NodeOrientation
typealias HorizontalDirection = javafx.geometry.HorizontalDirection
typealias Orientation = javafx.geometry.Orientation

//region Point

typealias Point2D = javafx.geometry.Point2D
typealias Point3D = javafx.geometry.Point3D

inline fun point(x: Double, y: Double): Point2D = Point2D(x, y)
inline fun point(x: Int, y: Int): Point2D = Point2D(x.toDouble(), y.toDouble())
inline fun point(x: Double, y: Double, z: Double): Point3D = Point3D(x, y, z)
inline fun point(x: Int, y: Int, z: Int): Point3D = Point3D(x.toDouble(), y.toDouble(), z.toDouble())

inline fun Point2D.toPair(): Pair<Double, Double> = Pair(this.x, this.y)
inline fun Point2D.toJFXPair(): JFXPair<Double, Double> = JFXPair(this.x, this.y)
inline fun Pair<Double, Double>.toPoint(): Point2D = Point2D(this.first, this.second)

inline fun Point3D.toTriple(): Triple<Double, Double, Double> = Triple(this.x, this.y, this.z)
inline fun Triple<Double, Double, Double>.toPoint(): Point3D = Point3D(this.first, this.second, this.third)

/**
 * @see javafx.geometry.Point2D.getX
 */
inline operator fun Point2D.component1(): Double = this.x

/**
 * @see javafx.geometry.Point2D.getY
 */
inline operator fun Point2D.component2(): Double = this.y

/**
 * @see javafx.geometry.Point3D.getX
 */
inline operator fun Point3D.component1(): Double = this.x

/**
 * @see javafx.geometry.Point3D.getY
 */
inline operator fun Point3D.component2(): Double = this.y

/**
 * @see javafx.geometry.Point3D.getZ
 */
inline operator fun Point3D.component3(): Double = this.z

/**
 * @see javafx.geometry.Point2D.add
 */
inline operator fun Point2D.plus(point: Point2D): Point2D = this.add(point)

/**
 * @see javafx.geometry.Point3D.add
 */
inline operator fun Point3D.plus(point: Point3D): Point3D = this.add(point)

/**
 * @see javafx.geometry.Point2D.subtract
 */
inline operator fun Point2D.minus(point: Point2D): Point2D = this.subtract(point)

/**
 * @see javafx.geometry.Point3D.subtract
 */
inline operator fun Point3D.minus(point: Point3D): Point3D = this.subtract(point)

/**
 * @see javafx.geometry.Point2D.multiply
 */
inline operator fun Point2D.times(factor: Double): Point2D = this.multiply(factor)

/**
 * @see javafx.geometry.Point3D.multiply
 */
inline operator fun Point3D.times(factor: Double): Point3D = this.multiply(factor)

/**
 * @see javafx.geometry.Point2D.multiply
 */
inline operator fun Point2D.times(factor: Int): Point2D = this.multiply(factor.toDouble())

/**
 * @see javafx.geometry.Point3D.multiply
 */
inline operator fun Point3D.times(factor: Int): Point3D = this.multiply(factor.toDouble())

/**
 * @see javafx.geometry.Point2D.multiply
 */
inline operator fun Double.times(point: Point2D): Point2D = point.multiply(this)

/**
 * @see javafx.geometry.Point3D.multiply
 */
inline operator fun Double.times(point: Point3D): Point3D = point.multiply(this)

/**
 * @see javafx.geometry.Point2D.multiply
 */
inline operator fun Int.times(point: Point2D): Point2D = point.multiply(this.toDouble())

/**
 * @see javafx.geometry.Point3D.multiply
 */
inline operator fun Int.times(point: Point3D): Point3D = point.multiply(this.toDouble())
//endregion

//region Insets

typealias Insets = javafx.geometry.Insets

inline fun insets(top: Double, right: Double, bottom: Double, left: Double): Insets = Insets(top, right, bottom, left)

inline fun insets(top: Int, right: Int, bottom: Int, left: Int): Insets =
        Insets(top.toDouble(), right.toDouble(), bottom.toDouble(), left.toDouble())

//endregion

//region Dimension2D

typealias Dimension2D = javafx.geometry.Dimension2D

inline fun dimension(width: Double, height: Double): Dimension2D = Dimension2D(width, height)

inline operator fun Dimension2D.component1(): Double = this.width
inline operator fun Dimension2D.component2(): Double = this.height

//endregion

//region Rectangle2D

typealias Rectangle2D = javafx.geometry.Rectangle2D

inline fun rectangle(minX: Double, minY: Double, width: Double, height: Double): Rectangle2D =
        Rectangle2D(minX, minY, width, height)

inline fun rectangle(minX: Int, minY: Int, width: Int, height: Int): Rectangle2D =
        Rectangle2D(minX.toDouble(), minY.toDouble(), width.toDouble(), height.toDouble())

/**
 * Tests if the specified point is inside the boundary of Rectangle2D.
 *
 * @see javafx.geometry.Rectangle2D.contains
 */
inline operator fun Rectangle2D.contains(p: Pair<Double, Double>): Boolean = this.contains(p.first, p.second)

//endregion

//region Bounds

typealias Bounds = javafx.geometry.Bounds

/**
 * @see javafx.geometry.Bounds.contains
 */
inline operator fun Bounds.contains(p: Pair<Double, Double>): Boolean = this.contains(p.first, p.second)

/**
 * @see javafx.geometry.Bounds.contains
 */
inline operator fun Bounds.contains(p: Triple<Double, Double, Double>): Boolean = this.contains(p.first, p.second, p.third)

//endregion

//region BoundingBox

typealias BoundingBox = javafx.geometry.BoundingBox

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

//endregion