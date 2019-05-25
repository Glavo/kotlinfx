@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.util.Duration

inline fun duration(time: String): Duration = Duration.valueOf(time)

val Double.milliseconds: Duration
    inline get() = Duration.millis(this)

val Double.millis: Duration
    inline get() = milliseconds

val Double.millisecond: Duration
    inline get() = milliseconds

val Double.milli: Duration
    inline get() = milliseconds

val Int.milliseconds: Duration
    inline get() = toDouble().milliseconds

val Int.millis: Duration
    inline get() = milliseconds

val Int.millisecond: Duration
    inline get() = milliseconds

val Int.milli: Duration
    inline get() = milliseconds


val Double.seconds: Duration
    inline get() = Duration.seconds(this)

val Double.second: Duration
    inline get() = seconds

val Int.seconds: Duration
    inline get() = toDouble().seconds

val Int.second: Duration
    inline get() = seconds


val Double.minutes: Duration
    inline get() = Duration.seconds(this)

val Double.minute: Duration
    inline get() = minutes

val Int.minutes: Duration
    inline get() = toDouble().minutes

val Int.minute: Duration
    inline get() = minutes


val Double.hours: Duration
    inline get() = Duration.hours(this)

val Double.hour: Duration
    inline get() = minutes

val Int.hours: Duration
    inline get() = toDouble().hours

val Int.hour: Duration
    inline get() = minutes

inline operator fun Duration.plus(other: Duration): Duration = this.add(other)

inline operator fun Duration.minus(other: Duration): Duration = this.subtract(other)

inline operator fun Duration.times(n: Double): Duration = this.multiply(n)

inline operator fun Duration.times(n: Int): Duration = this.multiply(n.toDouble())

inline operator fun Double.times(time: Duration): Duration = time.multiply(this)

inline operator fun Int.times(time: Duration): Duration = time.multiply(this.toDouble())

inline operator fun Duration.div(n: Double): Duration = this.divide(n)

inline operator fun Duration.div(n: Int): Duration = this.divide(n.toDouble())

inline operator fun Duration.unaryMinus(): Duration = this.negate()

inline operator fun Duration.unaryPlus(): Duration = this
