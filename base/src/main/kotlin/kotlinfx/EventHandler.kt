@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.event.Event
import javafx.event.EventHandler
import javafx.event.WeakEventHandler
import java.util.*

inline fun <T : Event> EventHandler<T>.toWeakHandler(): WeakEventHandler<T> = WeakEventHandler(this)

inline fun <T : Event> weakEventHandler(crossinline f: (T) -> Unit): WeakEventHandler<T> = WeakEventHandler(EventHandler<T> { f(it) })