@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.media

import javafx.event.EventHandler

typealias Media = javafx.scene.media.Media
typealias MediaView = javafx.scene.media.MediaView
typealias MediaPlayer = javafx.scene.media.MediaPlayer
typealias MediaErrorEvent = javafx.scene.media.MediaErrorEvent
typealias EqualizerBand = javafx.scene.media.EqualizerBand
typealias AudioClip = javafx.scene.media.AudioClip

inline fun media(source: String, initializer: Media.() -> Unit = {}): Media =
        Media(source).apply(initializer)

inline fun Media.onError(crossinline event: () -> Unit) {
    this.onError = Runnable { event() }
}

inline fun MediaPlayer.view(): MediaView = MediaView(this)

inline fun mediaView(mediaPlayer: MediaPlayer, initializer: MediaView.() -> Unit = {}): MediaView =
        MediaView(mediaPlayer).apply(initializer)

inline fun MediaView.onError(crossinline v: (MediaErrorEvent) -> Unit) {
    this.onError = EventHandler { v(it) }
}

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

inline fun equalizerBand(initializer: EqualizerBand.() -> Unit = {}): EqualizerBand =
        EqualizerBand().apply(initializer)

inline fun equalizerBand(centerFrequency: Double, bandwidth: Double, gain: Double,
                         initializer: EqualizerBand.() -> Unit = {}): EqualizerBand =
        EqualizerBand(centerFrequency, bandwidth, gain).apply(initializer)

inline fun audioClip(source: String, initializer: AudioClip.() -> Unit = {}): AudioClip =
        AudioClip(source).apply(initializer)