package kotlinfx.scene

import javafx.scene.effect.*

// ...
inline fun blend(
        mode: BlendMode = BlendMode.SRC_OVER,
        initializer: Blend.() -> Unit = {}): Blend {
    return Blend(mode).apply(initializer)
}

inline fun bloom(initializer: Bloom.() -> Unit = {}): Bloom {
    return Bloom().apply(initializer)
}

inline fun boxBlur(initializer: BoxBlur.() -> Unit = {}): BoxBlur {
    return BoxBlur().apply(initializer)
}

inline fun colorAdjust(initializer: ColorAdjust.() -> Unit = {}): ColorAdjust {
    return ColorAdjust().apply(initializer)
}

inline fun colorInput(initializer: ColorInput.() -> Unit = {}): ColorInput {
    return ColorInput().apply(initializer)
}

inline fun displacementMap(initializer: DisplacementMap.() -> Unit = {}): DisplacementMap {
    return DisplacementMap().apply(initializer)
}

inline fun dropShadow(initializer: DropShadow.() -> Unit = {}): DropShadow {
    return DropShadow().apply(initializer)
}

inline fun gaussianBlur(initializer: GaussianBlur.() -> Unit = {}): GaussianBlur {
    return GaussianBlur().apply(initializer)
}

inline fun glow(initializer: Glow.() -> Unit = {}): Glow {
    return Glow().apply(initializer)
}

inline fun imageInput(initializer: ImageInput.() -> Unit = {}): ImageInput {
    return ImageInput().apply(initializer)
}

inline fun innerShadow(initializer: InnerShadow.() -> Unit = {}): InnerShadow {
    return InnerShadow().apply(initializer)
}

inline fun distantLight(initializer: Light.Distant.() -> Unit = {}): Light.Distant {
    return Light.Distant().apply(initializer)
}

inline fun pointLight(initializer: Light.Point.() -> Unit = {}): Light.Point {
    return Light.Point().apply(initializer)
}

inline fun spotLight(initializer: Light.Spot.() -> Unit = {}): Light.Spot {
    return Light.Spot().apply(initializer)
}

inline fun lighting(initializer: Lighting.() -> Unit = {}): Lighting {
    return Lighting().apply(initializer)
}

inline fun motionBlur(initializer: MotionBlur.() -> Unit = {}): MotionBlur {
    return MotionBlur().apply(initializer)
}

inline fun perspectiveTransform(initializer: PerspectiveTransform.() -> Unit = {}): PerspectiveTransform {
    return PerspectiveTransform().apply(initializer)
}

inline fun reflection(initializer: Reflection.() -> Unit = {}): Reflection {
    return Reflection().apply(initializer)
}

inline fun sepiaTone(initializer: SepiaTone.() -> Unit = {}): SepiaTone {
    return SepiaTone().apply(initializer)

}

inline fun shadow(initializer: Shadow.() -> Unit = {}): Shadow {
    return Shadow().apply(initializer)
}