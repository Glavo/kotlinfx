@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias Color = javafx.scene.paint.Color
typealias CycleMethod = javafx.scene.paint.CycleMethod
typealias ImagePattern = javafx.scene.paint.ImagePattern
typealias LinearGradient = javafx.scene.paint.LinearGradient
typealias Material = javafx.scene.paint.Material
typealias Paint = javafx.scene.paint.Paint
typealias PhongMaterial = javafx.scene.paint.PhongMaterial
typealias RadialGradient = javafx.scene.paint.RadialGradient
typealias Stop = javafx.scene.paint.Stop

inline fun color(red: Double, green: Double, blue: Double, opacity: Double = 1.0): Color {
    return Color.color(red, green, blue, opacity)
}