package kotlinfx

typealias Parent= javafx.scene.Parent

inline fun Parent.subScene(width: Double, height: Double,
                           depthBuffer: Boolean = false, antiAliasing: SceneAntialiasing = SceneAntialiasing.DISABLED,
                           initializer: SubScene.() -> Unit = {}): SubScene =
        SubScene(this, width, height, depthBuffer, antiAliasing).apply(initializer)