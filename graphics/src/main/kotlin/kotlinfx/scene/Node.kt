package kotlinfx.scene

import javafx.event.*
import javafx.scene.*
import javafx.scene.input.*


inline fun Node.onDragDetected(crossinline v: (MouseEvent) -> Unit) {
    this.onDragDetected = EventHandler { v(it) }
}

inline fun Node.onDragDone(crossinline v: (DragEvent) -> Unit) {
    this.onDragDone = EventHandler { v(it) }
}

inline fun Node.onDragDropped(crossinline v: (DragEvent) -> Unit) {
    this.onDragDropped = EventHandler { v(it) }
}

inline fun Node.onDragEntered(crossinline v: (DragEvent) -> Unit) {
    this.onDragEntered = EventHandler { v(it) }
}

inline fun Node.onDragExited(crossinline v: (DragEvent) -> Unit) {
    this.onDragExited = EventHandler { v(it) }
}

inline fun Node.onDragOver(crossinline v: (DragEvent) -> Unit) {
    this.onDragOver = EventHandler { v(it) }
}

inline fun Node.onContextMenuRequested(crossinline v: (ContextMenuEvent) -> Unit) {
    this.onContextMenuRequested = EventHandler { v(it) }
}

inline fun Node.onMouseClicked(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseClicked = EventHandler { v(it) }
}

inline fun Node.onMouseDragged(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragged = EventHandler { v(it) }
}

inline fun Node.onMouseEntered(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseEntered = EventHandler { v(it) }
}

inline fun Node.onMouseExited(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseExited = EventHandler { v(it) }
}

inline fun Node.onMouseMoved(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseMoved = EventHandler { v(it) }
}

inline fun Node.onMousePressed(crossinline v: (MouseEvent) -> Unit) {
    this.onMousePressed = EventHandler { v(it) }
}

inline fun Node.onMouseReleased(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseReleased = EventHandler { v(it) }
}

inline fun Node.onMouseDragOver(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragOver = EventHandler { v(it) }
}

inline fun Node.onMouseDragReleased(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragReleased = EventHandler { v(it) }
}

inline fun Node.onMouseDragEntered(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragEntered = EventHandler { v(it) }
}

inline fun Node.onMouseDragExited(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragExited = EventHandler { v(it) }
}

inline fun Node.onScrollStarted(crossinline v: (ScrollEvent) -> Unit) {
    this.onScrollStarted = EventHandler { v(it) }
}

inline fun Node.onScroll(crossinline v: (ScrollEvent) -> Unit) {
    this.onScroll = EventHandler { v(it) }
}

inline fun Node.onScrollFinished(crossinline v: (ScrollEvent) -> Unit) {
    this.onScrollFinished = EventHandler { v(it) }
}

inline fun Node.onRotationStarted(crossinline v: (RotateEvent) -> Unit) {
    this.onRotationStarted = EventHandler { v(it) }
}

inline fun Node.onRotate(crossinline v: (RotateEvent) -> Unit) {
    this.onRotate = EventHandler { v(it) }
}

inline fun Node.onRotationFinished(crossinline v: (RotateEvent) -> Unit) {
    this.onRotationFinished = EventHandler { v(it) }
}

inline fun Node.onZoomStarted(crossinline v: (ZoomEvent) -> Unit) {
    this.onZoomStarted = EventHandler { v(it) }
}

inline fun Node.onZoom(crossinline v: (ZoomEvent) -> Unit) {
    this.onZoom = EventHandler { v(it) }
}

inline fun Node.onZoomFinished(crossinline v: (ZoomEvent) -> Unit) {
    this.onZoomFinished = EventHandler { v(it) }
}

inline fun Node.onSwipeUp(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeUp = EventHandler { v(it) }
}

inline fun Node.onSwipeDown(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeDown = EventHandler { v(it) }
}

inline fun Node.onSwipeLeft(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeLeft = EventHandler { v(it) }
}

inline fun Node.onSwipeRight(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeRight = EventHandler { v(it) }
}

inline fun Node.onTouchPressed(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchPressed = EventHandler { v(it) }
}

inline fun Node.onTouchMoved(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchMoved = EventHandler { v(it) }
}

inline fun Node.onTouchReleased(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchReleased = EventHandler { v(it) }
}

inline fun Node.onTouchStationary(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchStationary = EventHandler { v(it) }
}

inline fun Node.onKeyPressed(crossinline v: (KeyEvent) -> Unit) {
    this.onKeyPressed = EventHandler { v(it) }
}

inline fun Node.onKeyReleased(crossinline v: (KeyEvent) -> Unit) {
    this.onKeyReleased = EventHandler { v(it) }
}

inline fun Node.onKeyTyped(crossinline v: (KeyEvent) -> Unit) {
    this.onKeyTyped = EventHandler { v(it) }
}

inline fun Node.onInputMethodTextChanged(crossinline v: (InputMethodEvent) -> Unit) {
    this.onInputMethodTextChanged = EventHandler { v(it) }
}