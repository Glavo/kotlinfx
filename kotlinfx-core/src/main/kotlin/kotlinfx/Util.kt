@file:Suppress("NOTHING_TO_INLINE", "UNCHECKED_CAST")

package kotlinfx

import javafx.util.converter.*
import java.text.DateFormat
import java.text.Format
import java.text.NumberFormat
import java.time.chrono.Chronology
import java.time.chrono.IsoChronology
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.*

typealias Builder<T> = javafx.util.Builder<T>
typealias BuilderFactory = javafx.util.BuilderFactory

typealias Callback<P, R> = javafx.util.Callback<P, R>

//region Pair

typealias JFXPair<K, V> = javafx.util.Pair<K, V>

inline fun <K, V> JFXPair<out K, out V>.toKotlin(): Pair<K, V> = Pair(this.key, this.value)

inline fun <K, V> Pair<K, V>.toJFX(): JFXPair<K, V> = JFXPair(this.first, this.second)

inline fun <K, V> JFXPair<out K, out V>.narrow(): JFXPair<K, V> = this as JFXPair<K, V>

/**
 * @see javafx.util.Pair.getKey
 */
inline operator fun <T> JFXPair<out T, *>.component1(): T = this.key

/**
 * @see javafx.util.Pair.getValue
 */
inline operator fun <T> JFXPair<*, out T>.component2(): T = this.value

inline fun <T> JFXPair<out T, out T>.toList(): List<T> = listOf(this.key, this.value)

//endregion

//region IndexRange

typealias IndexRange = javafx.scene.control.IndexRange

inline fun indexRange(start: Int, end: Int): IndexRange {
    return IndexRange(start, end)
}

inline fun indexRange(range: IntRange): IndexRange {
    return IndexRange(range.first, range.last + 1)
}

inline fun IndexRange.toIntRange(): IntRange = start until end

inline fun IntRange.toIndexRange(): IndexRange = indexRange(this)

//endregion

//region Duration

typealias Duration = javafx.util.Duration

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

//endregion

//region StringConverter

typealias StringConverter<T> = javafx.util.StringConverter<T>

object StringConverters {
    val ofString = DefaultStringConverter()

    val ofBoolean = BooleanStringConverter()

    val ofChar = CharacterStringConverter()

    val ofByte = ByteStringConverter()
    val ofShort = ShortStringConverter()
    val ofInt = IntegerStringConverter()
    val ofLong = LongStringConverter()
    val ofBigInteger = BigIntegerStringConverter()


    val ofFloat = FloatStringConverter()
    val ofDouble = DoubleStringConverter()
    val ofBigDecimal = BigDecimalStringConverter()

    val ofNumber = NumberStringConverter()


    inline fun <T> ofFormat(format: Format) = FormatStringConverter<T>(format)


    inline fun ofCurrency(locale: Locale = Locale.getDefault(), pattern: String? = null) =
            CurrencyStringConverter(locale, pattern)

    inline fun ofCurrency(numberFormat: NumberFormat) =
            CurrencyStringConverter(numberFormat)


    inline fun ofPercentage(locale: Locale = Locale.getDefault()) =
            PercentageStringConverter(locale)

    inline fun ofPercentage(numberFormat: NumberFormat) =
            PercentageStringConverter(numberFormat)


    inline fun ofDateTime(
            locale: Locale = Locale.getDefault(Locale.Category.FORMAT),
            dateStyle: Int = DateFormat.DEFAULT,
            timeStyle: Int = DateFormat.DEFAULT
    ) = DateTimeStringConverter(locale, dateStyle, timeStyle)

    inline fun ofDateTime(locale: Locale = Locale.getDefault(Locale.Category.FORMAT), pattern: String) =
            DateTimeStringConverter(locale, pattern)

    inline fun ofDateTime(dateFormat: DateFormat) = DateTimeStringConverter(dateFormat)


    inline fun ofDate(
            locale: Locale = Locale.getDefault(Locale.Category.FORMAT),
            dateStyle: Int = DateFormat.DEFAULT) =
            DateStringConverter(locale, dateStyle)

    inline fun ofDate(locale: Locale = Locale.getDefault(Locale.Category.FORMAT), pattern: String) =
            DateStringConverter(locale, pattern)

    inline fun ofDate(dateFormat: DateFormat) = DateStringConverter(dateFormat)


    inline fun ofTime(
            locale: Locale = Locale.getDefault(Locale.Category.FORMAT),
            timeStyle: Int = DateFormat.DEFAULT) =
            TimeStringConverter(locale, timeStyle)

    inline fun ofTime(locale: Locale = Locale.getDefault(Locale.Category.FORMAT), pattern: String) =
            TimeStringConverter(locale, pattern)

    inline fun ofTime(dateFormat: DateFormat) = TimeStringConverter(dateFormat)


    inline fun ofLocalDateTime(
            dateStyle: FormatStyle? = null,
            timeStyle: FormatStyle? = null,
            locale: Locale = Locale.getDefault(Locale.Category.FORMAT),
            chronology: Chronology = IsoChronology.INSTANCE
    ) =
            LocalDateTimeStringConverter(dateStyle, timeStyle, locale, chronology)

    inline fun ofLocalDateTime(formatter: DateTimeFormatter, parser: DateTimeFormatter) =
            LocalDateTimeStringConverter(formatter, parser)


    inline fun ofLocalDate(
            dateStyle: FormatStyle? = null,
            locale: Locale = Locale.getDefault(Locale.Category.FORMAT),
            chronology: Chronology = IsoChronology.INSTANCE
    ) =
            LocalDateStringConverter(dateStyle, locale, chronology)

    inline fun ofLocalDate(formatter: DateTimeFormatter, parser: DateTimeFormatter) =
            LocalDateStringConverter(formatter, parser)


    inline fun ofLocalTime(
            timeStyle: FormatStyle? = null,
            locale: Locale = Locale.getDefault(Locale.Category.FORMAT)
    ) =
            LocalTimeStringConverter(timeStyle, locale)

    inline fun ofLocalTime(formatter: DateTimeFormatter, parser: DateTimeFormatter) =
            LocalDateTimeStringConverter(formatter, parser)
}

//endregion