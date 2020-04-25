package kotlinfx.application

import javafx.application.Application
import javafx.stage.Stage

object App {
    private lateinit var app: Helper

    lateinit var stage: Stage

    var onInit: () -> Unit = {}
    var onStop: () -> Unit = {}
    var stageInitializer: Stage.() -> Unit = {}

    var autoShow: Boolean = true

    class Helper : Application() {
        var onStop: () -> Unit = {}

        override fun init() {
            app = this
            onInit()
        }

        override fun start(primaryStage: Stage) {
            stage = primaryStage
            primaryStage.stageInitializer()
            if (autoShow) {
                stage.show()
            }
        }

        override fun stop() {
            onStop()
        }
    }

    fun run(
            args: Array<String>,
            autoShow: Boolean? = null,
            onInit: (() -> Unit)? = null,
            onStop: (() -> Unit)? = null,
            stageInitializer: Stage.() -> Unit) {
        if (onInit != null)
            App.onInit = onInit
        if (onStop != null)
            App.onStop = onStop
        App.stageInitializer = stageInitializer
        if (autoShow != null)
            App.autoShow = autoShow

        launch<Helper>(args)
    }

    fun onInit(f: () -> Unit) {
        App.onInit = f
    }

    fun onStop(f: () -> Unit) {
        App.onInit = f
    }
}
