@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

typealias JFXApplication = javafx.application.Application
typealias Parameters = javafx.application.Application.Parameters
typealias HostServices = javafx.application.HostServices

inline fun <reified T : JFXApplication> launch(args: Array<out String>) {
    JFXApplication.launch(T::class.java, *args)
}

inline fun <T : JFXApplication> launch(appClass: Class<out T>, args: Array<out String>) {
    JFXApplication.launch(appClass, *args)
}

inline fun launchApp(
        args: Array<String> = emptyArray(),
        autoShow: Boolean = true,
        crossinline onInit: (() -> Unit) = {},
        crossinline onStop: (() -> Unit) = {},
        crossinline stageInitializer: Stage.() -> Unit) {
    val app = object : App() {
        override fun init() {
            onInit()
        }

        override fun start(primaryStage: javafx.stage.Stage) {
            primaryStage.stageInitializer()
            if (autoShow) {
                primaryStage.show()
            }
        }

        override fun stop() {
            onStop()
        }
    }
    app.launch(args)
}