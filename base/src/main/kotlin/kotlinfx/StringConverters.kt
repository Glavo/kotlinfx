@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.util.converter.*
import java.text.*
import java.time.chrono.*
import java.time.format.*
import java.time.format.FormatStyle
import java.util.*

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


    inline fun ofCurrencyr(locale: Locale = Locale.getDefault(), pattern: String? = null) =
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
    ) =
            DateTimeStringConverter(locale, dateStyle, timeStyle)

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