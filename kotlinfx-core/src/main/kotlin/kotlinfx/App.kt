@file:Suppress("LeakingThis")

package kotlinfx

abstract class App {
    companion object {
        private val lock = Object()

        class Helper : JFXApplication() {
            init {
                if (helperIsInitialized) {
                    throw IllegalStateException()
                }
                helper = this
            }

            override fun init() {
                _app.init()
            }

            override fun start(primaryStage: Stage) {
                _app.start(primaryStage)
            }

            override fun stop() {
                _app.stop()
            }
        }

        @Volatile
        private lateinit var helper: Helper

        @Volatile
        private lateinit var _app: App

        private val appIsInitialized: Boolean
            get() = Companion::_app.isInitialized

        private val helperIsInitialized: Boolean
            get() = Companion::helper.isInitialized

        val app: App
            get() = _app

        val hostServices: HostServices
            get() = app.hostServices

        val parameters: Parameters
            get() = app.parameters

        var userAgentStylesheet: String?
            inline get() = JFXApplication.getUserAgentStylesheet()
            inline set(value) = JFXApplication.setUserAgentStylesheet(value)

    }

    /**
     * @see Application.init
     */
    protected open fun init() {}

    /**
     * @see Application.start
     */
    protected abstract fun start(primaryStage: Stage)

    /**
     * @see Application.stop
     */
    protected open fun stop() {}

    val hostServices: HostServices
        get() = helper.hostServices

    val parameters: Parameters
        get() = helper.parameters

    @JvmName("launchVararg")
    fun launch(vararg args: String) {
        this.launch(args)
    }

    fun launch(args: Array<out String>) {
        synchronized(lock) {
            if (appIsInitialized) {
                throw IllegalStateException("")
            }
            _app = this
        }
        JFXApplication.launch(Helper::class.java, *args)
    }
}
