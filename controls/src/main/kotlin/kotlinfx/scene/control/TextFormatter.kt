package kotlinfx.scene.control

import javafx.scene.control.TextFormatter
import javafx.util.StringConverter
import java.util.function.UnaryOperator

inline fun <V> textFormatter(valueConverter: StringConverter<V>? = null,
                             defaultValue: V? = null,
                             crossinline filter: (TextFormatter.Change) -> TextFormatter.Change): TextFormatter<V> {
    return TextFormatter<V>(valueConverter, defaultValue, UnaryOperator { filter(it) })
}