@file:Suppress("UNCHECKED_CAST")

package kotlinfx

typealias Service<V> = javafx.concurrent.Service<V>
typealias ScheduledService<V> = javafx.concurrent.ScheduledService<V>
typealias Worker<V> = javafx.concurrent.Worker<V>

//region Task

typealias Task<V> = javafx.concurrent.Task<V>

inline fun <V> task(crossinline f: Task<V>.() -> V): Task<V> {
    return object : Task<V>() {
        override fun call(): V = this.f()
    }
}

fun Task<*>.startInNewThread(
        isDaemon: Boolean = false,
        contextClassLoader: ClassLoader? = null,
        name: String? = null,
        priority: Int = -1): Thread {
    return Thread(this).apply {
        if (isDaemon)
            this.isDaemon = true
        if (priority > 0)
            this.priority = priority
        if (name != null)
            this.name = name
        if (contextClassLoader != null)
            this.contextClassLoader = contextClassLoader
        start()
    }
}

inline fun <V> Task<V>.onSucceeded(crossinline v: (V) -> Unit) {
    this.onSucceeded = EventHandler { v(it.source.value as V) }
}

inline fun Task<*>.onFailed(crossinline v: (Throwable) -> Unit) {
    this.onSucceeded = EventHandler { v(it.source.exception) }
}

//endregion

