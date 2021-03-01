package kotlinfx

typealias Scene = javafx.scene.Scene
typealias SubScene = javafx.scene.SubScene
typealias SceneAntialiasing = javafx.scene.SceneAntialiasing

inline fun scene(
        root: Parent = Group(),
        width: Double = -1.0,
        height: Double = -1.0,
        depthBuffer: Boolean = false,
        antiAliasing: SceneAntialiasing = SceneAntialiasing.DISABLED,
        initializer: Scene.() -> Unit = {}): Scene {
    return Scene(root, width, height, depthBuffer, antiAliasing).apply { initializer() }
}

val Scene.children: ObservableList<Node>
    inline get() {
        return when (val r = root) {
            is Group -> r.children
            is Pane -> r.children
            else -> throw IllegalStateException()
        }
    }

var Scene.contextValue: Node
    inline get() = children[0]
    inline set(value) {
        context = listOf(value)
    }


var Scene.context: Collection<Node>
    inline get() = children
    inline set(value) {
        children.setAll(value)
    }

//region Mouse Handling

inline fun Scene.onMouseClicked(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseClicked = EventHandler { v(it) }
}

inline fun Scene.onMouseDragged(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragged = EventHandler { v(it) }
}

inline fun Scene.onMouseEntered(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseEntered = EventHandler { v(it) }
}

inline fun Scene.onMouseExited(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseExited = EventHandler { v(it) }
}

inline fun Scene.onMouseMoved(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseExited = EventHandler { v(it) }
}

inline fun Scene.onMousePressed(crossinline v: (MouseEvent) -> Unit) {
    this.onMousePressed = EventHandler { v(it) }
}

inline fun Scene.onMouseReleased(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseReleased = EventHandler { v(it) }
}

inline fun Scene.onDragDetected(crossinline v: (MouseEvent) -> Unit) {
    this.onDragDetected = EventHandler { v(it) }
}

inline fun Scene.onMouseDragOver(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragOver = EventHandler { v(it) }
}

inline fun Scene.onMouseDragReleased(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragReleased = EventHandler { v(it) }
}

inline fun Scene.onMouseDragEntered(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragEntered = EventHandler { v(it) }
}

inline fun Scene.onMouseDragExited(crossinline v: (MouseEvent) -> Unit) {
    this.onMouseDragExited = EventHandler { v(it) }
}

//endregion

//region Gestures Handling

inline fun Scene.onScrollStarted(crossinline v: (ScrollEvent) -> Unit) {
    this.onScrollStarted = EventHandler { v(it) }
}

inline fun Scene.onScroll(crossinline v: (ScrollEvent) -> Unit) {
    this.onScroll = EventHandler { v(it) }
}

inline fun Scene.onScrollFinished(crossinline v: (ScrollEvent) -> Unit) {
    this.onScrollFinished = EventHandler { v(it) }
}

inline fun Scene.onRotationStarted(crossinline v: (RotateEvent) -> Unit) {
    this.onRotationStarted = EventHandler { v(it) }
}

inline fun Scene.onRotate(crossinline v: (RotateEvent) -> Unit) {
    this.onRotate = EventHandler { v(it) }
}

inline fun Scene.onRotationFinished(crossinline v: (RotateEvent) -> Unit) {
    this.onRotationFinished = EventHandler { v(it) }
}

inline fun Scene.onZoomStarted(crossinline v: (ZoomEvent) -> Unit) {
    this.onZoomStarted = EventHandler { v(it) }
}

inline fun Scene.onZoom(crossinline v: (ZoomEvent) -> Unit) {
    this.onZoom = EventHandler { v(it) }
}

inline fun Scene.onZoomFinished(crossinline v: (ZoomEvent) -> Unit) {
    this.onZoomFinished = EventHandler { v(it) }
}

inline fun Scene.onSwipeUp(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeUp = EventHandler { v(it) }
}

inline fun Scene.onSwipeDown(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeDown = EventHandler { v(it) }
}

inline fun Scene.onSwipeLeft(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeLeft = EventHandler { v(it) }
}

inline fun Scene.onSwipeRight(crossinline v: (SwipeEvent) -> Unit) {
    this.onSwipeRight = EventHandler { v(it) }
}

//endregion

//region Touch Handling

inline fun Scene.onTouchPressed(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchPressed = EventHandler { v(it) }
}

inline fun Scene.onTouchMoved(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchMoved = EventHandler { v(it) }
}

inline fun Scene.onTouchReleased(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchReleased = EventHandler { v(it) }
}

inline fun Scene.onTouchStationary(crossinline v: (TouchEvent) -> Unit) {
    this.onTouchStationary = EventHandler { v(it) }
}


inline fun Scene.onDragEntered(crossinline v: (DragEvent) -> Unit) {
    this.onDragEntered = EventHandler { v(it) }
}

inline fun Scene.onDragExited(crossinline v: (DragEvent) -> Unit) {
    this.onDragExited = EventHandler { v(it) }
}

inline fun Scene.onDragOver(crossinline v: (DragEvent) -> Unit) {
    this.onDragOver = EventHandler { v(it) }
}

inline fun Scene.onDragDropped(crossinline v: (DragEvent) -> Unit) {
    this.onDragDropped = EventHandler { v(it) }
}

inline fun Scene.onDragDone(crossinline v: (DragEvent) -> Unit) {
    this.onDragDone = EventHandler { v(it) }
}

//endregion

//region Keyboard Handling

inline fun Scene.onKeyPressed(crossinline v: (KeyEvent) -> Unit) {
    this.onKeyPressed = EventHandler { v(it) }
}

inline fun Scene.onKeyReleased(crossinline v: (KeyEvent) -> Unit) {
    this.onKeyReleased = EventHandler { v(it) }
}

inline fun Scene.onKeyTyped(crossinline v: (KeyEvent) -> Unit) {
    this.onKeyTyped = EventHandler { v(it) }
}

//endregion

//region Input Method Handling

inline fun Scene.onInputMethodTextChanged(crossinline v: (InputEvent) -> Unit) {
    this.onInputMethodTextChanged = EventHandler { v(it) }
}

//endregion
