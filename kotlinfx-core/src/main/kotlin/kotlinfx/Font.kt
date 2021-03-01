package kotlinfx

typealias Font = javafx.scene.text.Font
typealias FontPosture = javafx.scene.text.FontPosture
typealias FontWeight = javafx.scene.text.FontWeight
typealias FontSmoothingType = javafx.scene.text.FontSmoothingType

fun font(family: String? = null, weight: FontWeight? = null, posture: FontPosture? = null, size: Double = -1.0, initializer: Font.() -> Unit = {}): Font =
        Font.font(family, weight, posture, size).apply(initializer)