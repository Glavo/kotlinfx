package kotlinfx.animation

import javafx.animation.KeyFrame
import javafx.animation.KeyValue
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.util.Duration

inline fun keyFrame(
        time: Duration,
        name: String? = null,
        crossinline onFinished: (ActionEvent) -> Unit = {},
        vararg values: KeyValue,
        initializer: KeyFrame.() -> Unit = {}
): KeyFrame {
    return KeyFrame(time, name, EventHandler { onFinished(it) }, *values).apply(initializer)
}

@JvmName("keyFrameOfArray")
inline fun keyFrame(
        time: Duration,
        name: String? = null,
        crossinline onFinished: (ActionEvent) -> Unit = {},
        values: Array<out KeyValue>,
        initializer: KeyFrame.() -> Unit = {}
): KeyFrame {
    return KeyFrame(time, name, EventHandler { onFinished(it) }, *values).apply(initializer)
}

inline fun keyFrame(
        time: Duration,
        name: String? = null,
        crossinline onFinished: (ActionEvent) -> Unit = {},
        values: Collection<KeyValue>,
        initializer: KeyFrame.() -> Unit = {}
): KeyFrame {
    return KeyFrame(time, name, EventHandler { onFinished(it) }, values).apply(initializer)
}