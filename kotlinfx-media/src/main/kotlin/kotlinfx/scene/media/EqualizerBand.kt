package kotlinfx.scene.media

import javafx.scene.media.EqualizerBand

inline fun equalizerBand(initializer: EqualizerBand.() -> Unit = {}): EqualizerBand =
        EqualizerBand().apply(initializer)

inline fun equalizerBand(centerFrequency: Double, bandwidth: Double, gain: Double,
                         initializer: EqualizerBand.() -> Unit = {}): EqualizerBand =
        EqualizerBand(centerFrequency, bandwidth, gain).apply(initializer)