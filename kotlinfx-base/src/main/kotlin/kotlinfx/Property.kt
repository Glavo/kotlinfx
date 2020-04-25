@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.beans.property.*

inline fun booleanProperty(
        initialValue: Boolean = false,
        name: String = "",
        bean: Any? = null): BooleanProperty {
    return SimpleBooleanProperty(bean, name, initialValue)
}

inline fun floatProperty(
        initialValue: Float = 0.0f,
        name: String = "",
        bean: Any? = null): FloatProperty {
    return SimpleFloatProperty(bean, name, initialValue)
}

inline fun doubleProperty(
        initialValue: Double = 0.0,
        name: String = "",
        bean: Any? = null): DoubleProperty {
    return SimpleDoubleProperty(bean, name, initialValue)
}

inline fun integerProperty(
        initialValue: Int = 0,
        name: String = "",
        bean: Any? = null): IntegerProperty {
    return SimpleIntegerProperty(bean, name, initialValue)
}

inline fun longProperty(
        initialValue: Long = 0,
        name: String = "",
        bean: Any? = null): LongProperty {
    return SimpleLongProperty(bean, name, initialValue)
}

inline fun stringProperty(
        initialValue: String? = null,
        name: String = "",
        bean: Any? = null): StringProperty {
    return SimpleStringProperty(bean, name, initialValue)
}