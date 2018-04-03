@file:Suppress("UNCHECKED_CAST")

package kotlinfx.concurrent

import javafx.concurrent.*
import javafx.event.EventHandler

inline fun <V> task(start: Boolean = true, crossinline f: () -> V): Task<V> {
    return object : Task<V>() {
        override fun call(): V = f()
    }.apply { if (start) this.startInNewThread() }
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
