package kotlinfx.application

import javafx.application.*
import javafx.beans.property.ReadOnlyBooleanProperty

@Suppress("NOTHING_TO_INLINE")
object JFXUtilities {

    @JvmStatic
    inline fun runLater(crossinline f: () -> Unit) {
        Platform.runLater { f() }
    }

    @JvmStatic
    inline fun runLater(runnable: Runnable) {
        Platform.runLater(runnable)
    }

    @JvmStatic
    val isFxApplicationThread: Boolean
        inline get() = Platform.isFxApplicationThread()

    inline fun exit() {
        Platform.exit()
    }

    @JvmStatic
    var isImplicitExit: Boolean
        inline get() = Platform.isImplicitExit()
        inline set(value) = Platform.setImplicitExit(value)

    @JvmStatic
    inline fun isSupported(feature: ConditionalFeature): Boolean = Platform.isSupported(feature)

    @JvmStatic
    val isAccessibilityActive: Boolean
        inline get() = Platform.isAccessibilityActive()

    @JvmStatic
    val accessibilityActiveProperty: ReadOnlyBooleanProperty
        @JvmName("accessibilityActiveProperty")
        inline get() = Platform.accessibilityActiveProperty()
}
