package kotlinfx.scene.media

import javafx.scene.media.AudioClip

inline fun audioClip(source: String, initializer: AudioClip.() -> Unit = {}): AudioClip =
        AudioClip(source).apply(initializer)

