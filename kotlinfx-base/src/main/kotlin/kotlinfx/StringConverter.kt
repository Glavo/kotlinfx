package kotlinfx

import javafx.util.StringConverter

inline operator fun <T> StringConverter<T>.invoke(f: StringConverter<T>.() -> Unit) {
    this.f()
}