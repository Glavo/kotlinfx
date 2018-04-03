package kotlinfx.scene.control

import javafx.scene.control.ColorPicker
import javafx.scene.paint.Color

inline fun colorPicker(color: Color = Color.WHITE, initializer: ColorPicker.() -> Unit = {}): ColorPicker {
    return ColorPicker(color).also(initializer)
}