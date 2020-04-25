@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.geometry

import javafx.geometry.*

inline fun point(x: Double, y: Double): Point2D = Point2D(x, y)
inline fun point(x: Int, y: Int): Point2D = Point2D(x.toDouble(), y.toDouble())
inline fun point(x: Double, y: Double, z: Double): Point3D = Point3D(x, y, z)
inline fun point(x: Int, y: Int, z: Int): Point3D = Point3D(x.toDouble(), y.toDouble(), z.toDouble())

inline fun Point2D.toPair(): Pair<Double, Double> = Pair(this.x, this.y)
inline fun Pair<Double, Double>.toPoint(): Point2D = Point2D(this.first, this.second)

inline fun Point3D.toTriple(): Triple<Double, Double, Double> = Triple(this.x, this.y, this.z)
inline fun Triple<Double, Double, Double>.toPoint(): Point3D = Point3D(this.first, this.second, this.third)

inline operator fun Point2D.component1(): Double = this.x
inline operator fun Point2D.component2(): Double = this.y

inline operator fun Point3D.component1(): Double = this.x
inline operator fun Point3D.component2(): Double = this.y
inline operator fun Point3D.component3(): Double = this.z

inline operator fun Point2D.plus(point: Point2D): Point2D = this.add(point)
inline operator fun Point3D.plus(point: Point3D): Point3D = this.add(point)

inline operator fun Point2D.minus(point: Point2D): Point2D = this.subtract(point)
inline operator fun Point3D.minus(point: Point3D): Point3D = this.subtract(point)

inline operator fun Point2D.times(factor: Double): Point2D = this.multiply(factor)
inline operator fun Point3D.times(factor: Double): Point3D = this.multiply(factor)
inline operator fun Point2D.times(factor: Int): Point2D = this.multiply(factor.toDouble())
inline operator fun Point3D.times(factor: Int): Point3D = this.multiply(factor.toDouble())

inline operator fun Double.times(point: Point2D): Point2D = point.multiply(this)
inline operator fun Double.times(point: Point3D): Point3D = point.multiply(this)
inline operator fun Int.times(point: Point2D): Point2D = point.multiply(this.toDouble())
inline operator fun Int.times(point: Point3D): Point3D = point.multiply(this.toDouble())