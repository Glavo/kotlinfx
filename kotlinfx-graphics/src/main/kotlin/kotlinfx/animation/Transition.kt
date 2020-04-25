package kotlinfx.animation

import javafx.animation.*
import javafx.scene.Node
import javafx.scene.paint.Color
import javafx.scene.shape.Shape
import javafx.util.Duration

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