package kotlinfx.scene.control

import javafx.scene.control.Toggle
import javafx.scene.control.ToggleGroup

inline fun toggleGroup(vararg items: Toggle, initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply { toggles.addAll(items) }.apply(initializer)
}

@JvmName("choiceBoxOfArray")
inline fun toggleGroup(items: Array<out Toggle>, initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply { toggles.addAll(items) }.apply(initializer)
}

inline fun toggleGroup(items: Collection<Toggle>, initializer: ToggleGroup.() -> Unit = {}): ToggleGroup {
    return ToggleGroup().apply { toggles.addAll(items) }.apply(initializer)
}
