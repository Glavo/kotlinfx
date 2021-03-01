package kotlinfx

typealias LightBase = javafx.scene.LightBase
typealias PointLight = javafx.scene.PointLight
typealias AmbientLight = javafx.scene.AmbientLight

inline fun pointLight(color: Color = Color.WHITE, initializer: PointLight.() -> Unit = {}): PointLight {
    return PointLight(color).apply(initializer)
}

inline fun ambientLight(color: Color = Color.WHITE, initializer: AmbientLight.() -> Unit = {}): AmbientLight {
    return AmbientLight(color).apply(initializer)
}