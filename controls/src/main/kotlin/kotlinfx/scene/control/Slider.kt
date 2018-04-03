package kotlinfx.scene.control

import javafx.scene.control.Slider

inline fun slider(min: Double = 0.0, max: Double = 100.0, value: Double = 0.0, initializer: Slider.() -> Unit = {}): Slider {
    return Slider(min, max, value).apply(initializer)
}
