package kotlinfx.scene

import javafx.scene.*
import javafx.scene.image.Image

inline fun imageCursor(image: Image,
                       hotspotX: Double = 0.0,
                       hotspotY: Double = 0.0,
                       initializer: ImageCursor.() -> Unit = {}): ImageCursor =
        ImageCursor(image, hotspotX, hotspotY).apply(initializer)