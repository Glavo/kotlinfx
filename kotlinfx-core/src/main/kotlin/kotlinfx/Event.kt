package kotlinfx

typealias Event = javafx.event.Event
typealias ActionEvent = javafx.event.ActionEvent
typealias EventType<T> = javafx.event.EventType<T>
typealias EventHandler<T> = javafx.event.EventHandler<T>
typealias EventDispatcher = javafx.event.EventDispatcher
typealias EventDispatchChain = javafx.event.EventDispatchChain
typealias EventTarget = javafx.event.EventTarget
typealias WeakEventHandler<T> = javafx.event.WeakEventHandler<T>

@FunctionalInterface
interface Subscription : () -> Unit {
    companion object {
        inline operator fun invoke(crossinline f: () -> Unit): Subscription = object : Subscription {
            override fun cancel() = f()
        }
    }

    /**
     * Remove Event listening.
     */
    fun cancel()

    override fun invoke() = cancel()
}