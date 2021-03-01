package kotlinfx

typealias Camera = javafx.scene.Camera
typealias ParallelCamera = javafx.scene.ParallelCamera
typealias PerspectiveCamera = javafx.scene.PerspectiveCamera

inline fun parallelCamera(initializer: ParallelCamera.() -> Unit = {}): ParallelCamera = ParallelCamera().apply(initializer)

inline fun perspectiveCamera(fixedEyeAtCameraZero: Boolean = false, initializer: PerspectiveCamera.() -> Unit = {}): PerspectiveCamera =
        PerspectiveCamera(fixedEyeAtCameraZero).apply(initializer)