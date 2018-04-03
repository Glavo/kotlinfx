package kotlinfx

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