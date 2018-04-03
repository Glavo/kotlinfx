@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.scene

import javafx.scene.shape.*
import javafx.scene.transform.Transform

infix operator fun Path.plusAssign(elem: PathElement) {
    this.elements.add(elem)
}

infix operator fun Path.plusAssign(elem: Array<out PathElement>) {
    this.elements.addAll(elem)
}

infix operator fun Path.plusAssign(elem: Collection<PathElement>) {
    this.elements.addAll(elem)
}

inline fun path(vararg elems: PathElement): Path =
        Path(*elems)

@JvmName("pathOfArray")
inline fun path(elems: Array<out PathElement>): Path =
        Path(*elems)

inline fun path(elems: Collection<PathElement>): Path =
        Path(elems)

inline fun arc(initializer: Arc.() -> Unit = {}): Arc =
        Arc().apply(initializer)


inline fun arcTo(initializer: ArcTo.() -> Unit = {}): ArcTo =
        ArcTo().apply(initializer)


inline fun box(initializer: Box.() -> Unit = {}): Box =
        Box().apply(initializer)


inline fun circle(initializer: Circle.() -> Unit = {}): Circle =
        Circle().apply(initializer)


inline fun closePath(initializer: ClosePath.() -> Unit = {}): ClosePath =
        ClosePath().apply(initializer)

inline fun cubicCurve(initializer: CubicCurve.() -> Unit = {}): CubicCurve =
        CubicCurve().apply(initializer)

inline fun cubicCurveTo(initializer: CubicCurveTo.() -> Unit = {}): CubicCurveTo =
        CubicCurveTo().apply(initializer)

inline fun cylinder(initializer: Cylinder.() -> Unit = {}): Cylinder =
        Cylinder().apply(initializer)

inline fun ellipse(initializer: Ellipse.() -> Unit = {}): Ellipse =
        Ellipse().apply(initializer)

inline fun hLineTo(initializer: HLineTo.() -> Unit = {}): HLineTo =
        HLineTo().apply(initializer)

inline fun line(initializer: Line.() -> Unit = {}): Line =
        Line().apply(initializer)

inline fun lineTo(initializer: LineTo.() -> Unit = {}): LineTo =
        LineTo().apply(initializer)

inline fun meshView(initializer: MeshView.() -> Unit = {}): MeshView =
        MeshView().apply(initializer)

inline fun moveTo(initializer: MoveTo.() -> Unit = {}): MoveTo =
        MoveTo().apply(initializer)

inline fun polygon(initializer: Polygon.() -> Unit = {}): Polygon =
        Polygon().apply(initializer)

inline fun polyline(initializer: Polyline.() -> Unit = {}): Polyline =
        Polyline().apply(initializer)

inline fun quadCurve(initializer: QuadCurve.() -> Unit = {}): QuadCurve =
        QuadCurve().apply(initializer)

inline fun quadCurveTo(initializer: QuadCurveTo.() -> Unit = {}): QuadCurveTo =
        QuadCurveTo().apply(initializer)

inline fun rectangle(initializer: Rectangle.() -> Unit = {}): Rectangle =
        Rectangle().apply(initializer)

inline fun sphere(initializer: Sphere.() -> Unit = {}): Sphere =
        Sphere().apply(initializer)

inline fun triangleMesh(initializer: TriangleMesh.() -> Unit = {}): TriangleMesh =
        TriangleMesh().apply(initializer)

inline fun vLineTo(initializer: VLineTo.() -> Unit = {}): VLineTo =
        VLineTo().apply(initializer)