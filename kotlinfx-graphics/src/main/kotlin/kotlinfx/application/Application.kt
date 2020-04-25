@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx.application

import javafx.application.Application
import javafx.stage.Stage
import kotlin.reflect.KClass

inline fun <reified T : Application> launch(vararg args: String) = Application.launch(T::class.java, *args)

@JvmName("launchWithArrayArgs")
inline fun <reified T : Application> launch(args: Array<out String>) = Application.launch(T::class.java, *args)

inline fun <T : Application> Class<T>.launch(vararg args: String) = Application.launch(this, *args)

@JvmName("launchWithArrayArgs")
inline fun <T : Application> Class<T>.launch(args: Array<out String>) = Application.launch(this, *args)

inline fun <T : Application> KClass<T>.launch(vararg args: String) = Application.launch(this.java, *args)

@JvmName("launchWithArrayArgs")
inline fun <T : Application> KClass<T>.launch(args: Array<out String>) = Application.launch(this.java, *args)

fun runApp(
        args: Array<String>,
        autoShow: Boolean? = null,
        onInit: (() -> Unit)? = null,
        onStop: (() -> Unit)? = null,
        stageInitializer: Stage.() -> Unit) {
    App.run(args, autoShow, onInit, onStop, stageInitializer)
}

fun runApp(
        autoShow: Boolean? = null,
        onInit: (() -> Unit)? = null,
        onStop: (() -> Unit)? = null,
        stageInitializer: Stage.() -> Unit) {
    App.run(arrayOf(), autoShow, onInit, onStop, stageInitializer)
}
