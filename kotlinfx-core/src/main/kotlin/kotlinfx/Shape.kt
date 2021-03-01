@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias Shape = javafx.scene.shape.Shape
typealias Arc = javafx.scene.shape.Arc
typealias Circle = javafx.scene.shape.Circle
typealias CubicCurve = javafx.scene.shape.CubicCurve
typealias Ellipse = javafx.scene.shape.Ellipse
typealias Line = javafx.scene.shape.Line
typealias ShapePath = javafx.scene.shape.Path // TODO
typealias Polygon = javafx.scene.shape.Polygon
typealias Polyline = javafx.scene.shape.Polyline
typealias QuadCurve = javafx.scene.shape.QuadCurve
typealias Rectangle = javafx.scene.shape.Rectangle
typealias SVGPath = javafx.scene.shape.SVGPath

typealias Shape3D = javafx.scene.shape.Shape3D
typealias Box = javafx.scene.shape.Box
typealias Cylinder = javafx.scene.shape.Cylinder
typealias MeshView = javafx.scene.shape.MeshView
typealias Sphere = javafx.scene.shape.Sphere

typealias Mesh = javafx.scene.shape.Mesh
typealias TriangleMesh = javafx.scene.shape.TriangleMesh

typealias PathElement = javafx.scene.shape.PathElement
typealias ClosePath = javafx.scene.shape.ClosePath
typealias ArcTo = javafx.scene.shape.ArcTo
typealias CubicCurveTo = javafx.scene.shape.CubicCurveTo
typealias HLineTo = javafx.scene.shape.HLineTo
typealias LineTo = javafx.scene.shape.LineTo
typealias MoveTo = javafx.scene.shape.MoveTo
typealias QuadCurveTo = javafx.scene.shape.QuadCurveTo
typealias VLineTo = javafx.scene.shape.VLineTo

typealias ArcType = javafx.scene.shape.ArcType
typealias CullFace = javafx.scene.shape.CullFace
typealias DrawMode = javafx.scene.shape.DrawMode
typealias FillRule = javafx.scene.shape.FillRule
typealias StrokeLineCap = javafx.scene.shape.StrokeLineCap
typealias StrokeLineJoin = javafx.scene.shape.StrokeLineJoin
typealias StrokeType = javafx.scene.shape.StrokeType

typealias ObservableFaceArray = javafx.scene.shape.ObservableFaceArray
typealias VertexFormat = javafx.scene.shape.VertexFormat

infix operator fun ShapePath.plusAssign(elem: PathElement) {
    this.elements.add(elem)
}

infix operator fun ShapePath.plusAssign(elem: Array<out PathElement>) {
    this.elements.addAll(elem)
}

infix operator fun ShapePath.plusAssign(elem: Collection<PathElement>) {
    this.elements.addAll(elem)
}

inline fun shapePath(vararg elems: PathElement): ShapePath =
        ShapePath(*elems)

@JvmName("shapePathOfArray")
inline fun shapePath(elems: Array<out PathElement>): ShapePath =
        ShapePath(*elems)

inline fun shapePath(elems: Collection<PathElement>): ShapePath =
        ShapePath(elems)

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