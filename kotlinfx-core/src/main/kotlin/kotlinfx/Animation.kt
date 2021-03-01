@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.Node
import javafx.scene.paint.Color
import javafx.scene.shape.Shape
import javafx.util.Duration

//region Animation

typealias Animation = javafx.animation.Animation

inline fun Animation.onFinished(crossinline v: (ActionEvent) -> Unit) {
    this.onFinished = EventHandler { v(it) }
}

//endregion

//region Interpolatable

typealias Interpolatable<T> = javafx.animation.Interpolatable<T>

inline fun <T> Interpolatable<T>.run(endValue: T, t: Double): T = this.interpolate(endValue, t)

//endregion

typealias KeyValue = javafx.animation.KeyValue

//region KeyFrame

typealias KeyFrame = javafx.animation.KeyFrame

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

//endregion

//region Timeline

typealias Timeline = javafx.animation.Timeline

inline fun timeline(targetFramerate: Double? = null, vararg keyFrames: javafx.animation.KeyFrame, initializer: Timeline.() -> Unit = {}): Timeline {
    return (targetFramerate?.let { Timeline(targetFramerate, *keyFrames) } ?: Timeline(*keyFrames)).apply(initializer)
}

@JvmName("timelineOfArray")
inline fun timeline(targetFramerate: Double? = null, keyFrames: Array<out javafx.animation.KeyFrame>, initializer: Timeline.() -> Unit = {}): Timeline {
    return (targetFramerate?.let { Timeline(targetFramerate, *keyFrames) } ?: Timeline(*keyFrames)).apply(initializer)
}

inline fun timeline(targetFramerate: Double? = null, keyFrames: Collection<javafx.animation.KeyFrame>, initializer: Timeline.() -> Unit = {}): Timeline {
    return (targetFramerate?.let { Timeline(targetFramerate, *keyFrames.toTypedArray()) } ?: Timeline(*keyFrames.toTypedArray())).apply(initializer)
}

//endregion

//region Transition

typealias FadeTransition = javafx.animation.FadeTransition
typealias FillTransition = javafx.animation.FillTransition
typealias ParallelTransition = javafx.animation.ParallelTransition
typealias PathTransition = javafx.animation.PathTransition
typealias PauseTransition = javafx.animation.PauseTransition
typealias RotateTransition = javafx.animation.RotateTransition
typealias ScaleTransition = javafx.animation.ScaleTransition
typealias SequentialTransition = javafx.animation.SequentialTransition
typealias StrokeTransition = javafx.animation.StrokeTransition
typealias TranslateTransition = javafx.animation.TranslateTransition

@JvmField
val TRANSITION_DEFAULT_DURATION = Duration.millis(400.0)!!

inline fun fadeTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        node: Node? = null,
        initializer: FadeTransition.() -> Unit = {}): FadeTransition {
    return FadeTransition(duration, node).apply(initializer)
}

inline fun fillTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        shape: Shape? = null,
        fromValue: Color? = null,
        toValue: Color? = null,
        initializer: FillTransition.() -> Unit = {}): FillTransition {
    return FillTransition(duration, shape, fromValue, toValue).apply(initializer)
}

inline fun parallelTransition(
        node: Node? = null,
        vararg children: Animation,
        initializer: ParallelTransition.() -> Unit = {}): ParallelTransition {
    return ParallelTransition(node, *children).apply(initializer)
}

@JvmName("parallelTransitionOfArray")
inline fun parallelTransition(
        node: Node? = null,
        children: Array<out Animation>,
        initializer: ParallelTransition.() -> Unit = {}): ParallelTransition {
    return ParallelTransition(node, *children).apply(initializer)
}

inline fun parallelTransition(
        node: Node? = null,
        children: Collection<Animation>,
        initializer: ParallelTransition.() -> Unit = {}): ParallelTransition {
    return ParallelTransition(node, *children.toTypedArray()).apply(initializer)
}

inline fun pathTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        path: Shape? = null,
        node: Node? = null,
        initializer: PathTransition.() -> Unit = {}): PathTransition {
    return PathTransition(duration, path, node).apply(initializer)
}

inline fun pauseTransition(duration: Duration = TRANSITION_DEFAULT_DURATION, initializer: PauseTransition.() -> Unit = {}): PauseTransition {
    return PauseTransition(duration).apply(initializer)
}

inline fun rotateTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        node: Node? = null,
        initializer: RotateTransition.() -> Unit = {}): RotateTransition {
    return RotateTransition(duration, node).apply(initializer)
}

inline fun scaleTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        node: Node? = null,
        initializer: ScaleTransition.() -> Unit = {}): ScaleTransition {
    return ScaleTransition(duration, node).apply(initializer)
}

inline fun sequentialTransition(
        node: Node? = null,
        vararg children: Animation,
        initializer: SequentialTransition.() -> Unit = {}): SequentialTransition {
    return SequentialTransition(node, *children).apply(initializer)
}

@JvmName("sequentialTransitionOfArray")
inline fun sequentialTransition(
        node: Node? = null,
        children: Array<out Animation>,
        initializer: SequentialTransition.() -> Unit = {}): SequentialTransition {
    return SequentialTransition(node, *children).apply(initializer)
}

inline fun sequentialTransition(
        node: Node? = null,
        children: Collection<Animation>,
        initializer: SequentialTransition.() -> Unit = {}): SequentialTransition {
    return SequentialTransition(node, *children.toTypedArray()).apply(initializer)
}

inline fun strokeTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        shape: Shape? = null,
        fromValue: Color? = null,
        toValue: Color? = null,
        initializer: StrokeTransition.() -> Unit = {}): StrokeTransition {
    return StrokeTransition(duration, shape, fromValue, toValue).apply(initializer)
}

inline fun translateTransition(
        duration: Duration = TRANSITION_DEFAULT_DURATION,
        node: Node? = null,
        initializer: TranslateTransition.() -> Unit = {}): TranslateTransition {
    return TranslateTransition(duration, node).apply(initializer)
}

//endregion