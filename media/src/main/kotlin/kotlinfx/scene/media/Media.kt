package kotlinfx.scene.media

import javafx.scene.media.Media

inline fun media(source: String, initializer: Media.() -> Unit = {}): Media =
        Media(source).apply(initializer)