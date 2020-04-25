package kotlinfx.animation

import javafx.animation.KeyFrame
import javafx.animation.Timeline


inline fun timeline(targetFramerate: Double? = null, vararg keyFrames: KeyFrame, initializer: Timeline.() -> Unit = {}): Timeline {
    return (targetFramerate?.let { Timeline(targetFramerate, *keyFrames) } ?: Timeline(*keyFrames)).apply(initializer)
}

@JvmName("timelineOfArray")
inline fun timeline(targetFramerate: Double? = null, keyFrames: Array<out KeyFrame>, initializer: Timeline.() -> Unit = {}): Timeline {
    return (targetFramerate?.let { Timeline(targetFramerate, *keyFrames) } ?: Timeline(*keyFrames)).apply(initializer)
}

inline fun timeline(targetFramerate: Double? = null, keyFrames: Collection<KeyFrame>, initializer: Timeline.() -> Unit = {}): Timeline {
    return (targetFramerate?.let { Timeline(targetFramerate, *keyFrames.toTypedArray()) } ?: Timeline(*keyFrames.toTypedArray())).apply(initializer)
}