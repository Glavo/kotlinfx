package kotlinfx.scene

import javafx.scene.*

inline fun Parent.subScene(width: Double, height: Double,
                           depthBuffer: Boolean = false, antiAliasing: SceneAntialiasing = SceneAntialiasing.DISABLED,
                           initializer: SubScene.() -> Unit = {}): SubScene =
        SubScene(this, width, height, depthBuffer, antiAliasing).apply(initializer)