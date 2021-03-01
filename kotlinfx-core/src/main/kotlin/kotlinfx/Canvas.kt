@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias Canvas = javafx.scene.canvas.Canvas
typealias GraphicsContext = javafx.scene.canvas.GraphicsContext

inline fun canvas(): Canvas = Canvas()

inline fun canvas(width: Double, height: Double): Canvas = Canvas(width, height)

inline fun canvas(width: Int, height: Int): Canvas = Canvas(width.toDouble(), height.toDouble())

inline fun Canvas.withGraphicsContext(f: GraphicsContext.() -> Unit) {
    this.graphicsContext2D.f()
}