@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.scene.media

import javafx.event.EventHandler
import javafx.scene.media.*

inline fun MediaPlayer.view(): MediaView = MediaView(this)

inline fun mediaView(mediaPlayer: MediaPlayer, initializer: MediaView.() -> Unit = {}): MediaView =
        MediaView(mediaPlayer).apply(initializer)

inline fun MediaView.onError(crossinline v: (MediaErrorEvent) -> Unit) {
    this.onError = EventHandler { v(it) }
}