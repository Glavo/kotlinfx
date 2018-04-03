@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.scene

import javafx.scene.transform.*

inline operator fun Transform.plus(transform: Transform): Transform = this.createConcatenation(transform)

inline operator fun Affine.plusAssign(transform: Transform): Unit = this.append(transform)

inline fun affine(initializer: Affine.() -> Unit = {}): Affine =
        Affine().apply(initializer)

inline fun affine(transform: Transform, initializer: Affine.() -> Unit = {}): Affine =
        Affine(transform).apply(initializer)

inline fun affine(mxx: Double, mxy: Double, tx: Double,
                  myx: Double, myy: Double, ty: Double,
                  initializer: Affine.() -> Unit = {}): Affine = Affine(mxx, mxy, tx, myx, myy, ty).apply(initializer)

inline fun affine(mxx: Double, mxy: Double, mxz: Double, tx: Double,
                  myx: Double, myy: Double, myz: Double, ty: Double,
                  mzx: Double, mzy: Double, mzz: Double, tz: Double,
                  initializer: Affine.() -> Unit = {}): Affine =
        Affine(mxx, mxy, mxz, tx, myx, myy, myz, ty, mzx, mzy, mzz, tz).apply(initializer)

inline fun affine(matrix: DoubleArray, type: MatrixType, offset: Int, initializer: Affine.() -> Unit = {}): Affine =
        Affine(matrix, type, offset).apply(initializer)

inline fun rotate(initializer: Rotate.() -> Unit = {}): Rotate = Rotate().apply(initializer)

inline fun scale(initializer: Scale.() -> Unit = {}): Scale = Scale().apply(initializer)

inline fun shear(initializer: Shear.() -> Unit = {}): Shear = Shear().apply(initializer)