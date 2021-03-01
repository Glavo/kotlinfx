package kotlinfx

typealias Cursor = javafx.scene.Cursor
typealias ImageCursor = javafx.scene.ImageCursor

inline fun imageCursor(image: Image,
                       hotspotX: Double = 0.0,
                       hotspotY: Double = 0.0,
                       initializer: ImageCursor.() -> Unit = {}): ImageCursor =
        ImageCursor(image, hotspotX, hotspotY).apply(initializer)