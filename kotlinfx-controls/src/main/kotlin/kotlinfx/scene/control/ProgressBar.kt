package kotlinfx.scene.control

import javafx.scene.control.ProgressBar
import javafx.scene.control.ProgressIndicator

inline fun progressBar(progress: Double = ProgressIndicator.INDETERMINATE_PROGRESS, initializer: ProgressBar.() -> Unit = {}): ProgressBar {
    return ProgressBar(progress).apply(initializer)
}

inline fun progressIndicator(progress: Double = ProgressIndicator.INDETERMINATE_PROGRESS, initializer: ProgressIndicator.() -> Unit = {}): ProgressIndicator {
    return ProgressIndicator(progress).apply(initializer)
}
