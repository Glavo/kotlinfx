package kotlinfx.scene.media

import javafx.scene.media.Media
import javafx.scene.media.MediaPlayer

inline fun mediaPlayer(media: Media, initializer: MediaPlayer.() -> Unit = {}): MediaPlayer =
        MediaPlayer(media).apply(initializer)

inline fun MediaPlayer.onEndOfMedia(crossinline v: () -> Unit) {
    this.onEndOfMedia = Runnable { v() }
}

inline fun MediaPlayer.onReady(crossinline v: () -> Unit) {
    this.onReady = Runnable { v() }
}

inline fun MediaPlayer.onPlaying(crossinline v: () -> Unit) {
    this.onPlaying = Runnable { v() }
}

inline fun MediaPlayer.onPaused(crossinline v: () -> Unit) {
    this.onPaused = Runnable { v() }
}

inline fun MediaPlayer.onStopped(crossinline v: () -> Unit) {
    this.onStopped = Runnable { v() }
}

inline fun MediaPlayer.onHalted(crossinline v: () -> Unit) {
    this.onHalted = Runnable { v() }
}

inline fun MediaPlayer.onRepeat(crossinline v: () -> Unit) {
    this.onRepeat = Runnable { v() }
}

inline fun MediaPlayer.onStalled(crossinline v: () -> Unit) {
    this.onStalled = Runnable { v() }
}
