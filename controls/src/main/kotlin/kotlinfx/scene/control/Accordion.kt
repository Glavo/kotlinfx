package kotlinfx.scene.control

import javafx.scene.control.Accordion
import javafx.scene.control.TitledPane

inline fun accordion(vararg titledPanes: TitledPane, initializer: Accordion.() -> Unit = {}): Accordion {
    return Accordion(*titledPanes).apply(initializer)
}

@JvmName("accordionOfArray")
inline fun accordion(titledPanes: Array<out TitledPane>, initializer: Accordion.() -> Unit = {}): Accordion {
    return Accordion(*titledPanes).apply(initializer)
}

inline fun accordion(titledPanes: Collection<TitledPane>, initializer: Accordion.() -> Unit = {}): Accordion {
    return Accordion().apply {
        this.panes.addAll(titledPanes)
    }.apply(initializer)
}
