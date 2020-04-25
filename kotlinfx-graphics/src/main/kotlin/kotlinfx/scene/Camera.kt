package kotlinfx.scene

import javafx.scene.ParallelCamera
import javafx.scene.PerspectiveCamera

inline fun parallelCamera(initializer: ParallelCamera.() -> Unit = {}): ParallelCamera = ParallelCamera().apply(initializer)

inline fun perspectiveCamera(fixedEyeAtCameraZero: Boolean = false, initializer: PerspectiveCamera.() -> Unit = {}): PerspectiveCamera =
        PerspectiveCamera(fixedEyeAtCameraZero).apply(initializer)