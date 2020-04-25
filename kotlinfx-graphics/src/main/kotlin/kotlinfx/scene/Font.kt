package kotlinfx.scene

import javafx.scene.text.Font
import javafx.scene.text.FontPosture
import javafx.scene.text.FontWeight

fun font(family: String? = null, weight: FontWeight? = null, posture: FontPosture? = null, size: Double = -1.0, initializer: Font.() -> Unit = {}): Font =
        Font.font(family, weight, posture, size).apply(initializer)