package kotlinfx.animation

import javafx.animation.Animation
import javafx.event.ActionEvent
import javafx.event.EventHandler

inline fun Animation.onFinished(crossinline v: (ActionEvent) -> Unit) {
    this.onFinished = EventHandler { v(it) }
}