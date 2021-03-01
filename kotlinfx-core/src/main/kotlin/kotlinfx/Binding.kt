@file:Suppress("NOTHING_TO_INLINE", "EXPERIMENTAL_FEATURE_WARNING")

package kotlinfx

import javafx.beans.binding.Bindings
import javafx.beans.binding.When as JFXWhen
import java.util.concurrent.Callable

typealias Binding<T> = javafx.beans.binding.Binding<T>
typealias BooleanBinding = javafx.beans.binding.BooleanBinding
typealias NumberBinding = javafx.beans.binding.NumberBinding
typealias FloatBinding = javafx.beans.binding.FloatBinding
typealias DoubleBinding = javafx.beans.binding.DoubleBinding
typealias IntegerBinding = javafx.beans.binding.IntegerBinding
typealias LongBinding = javafx.beans.binding.LongBinding
typealias ObjectBinding<T> = javafx.beans.binding.ObjectBinding<T>
typealias StringBinding = javafx.beans.binding.StringBinding
typealias ListBinding<E> = javafx.beans.binding.ListBinding<E>
typealias SetBinding<E> = javafx.beans.binding.SetBinding<E>
typealias MapBinding<K, V> = javafx.beans.binding.MapBinding<K, V>

typealias BooleanExpression = javafx.beans.binding.BooleanExpression
typealias NumberExpression = javafx.beans.binding.NumberExpression
typealias FloatExpression = javafx.beans.binding.FloatExpression
typealias DoubleExpression = javafx.beans.binding.DoubleExpression
typealias IntegerExpression = javafx.beans.binding.IntegerExpression
typealias LongExpression = javafx.beans.binding.LongExpression
typealias ObjectExpression<T> = javafx.beans.binding.ObjectExpression<T>
typealias StringExpression = javafx.beans.binding.StringExpression
typealias ListExpression<E> = javafx.beans.binding.ListExpression<E>
typealias SetExpression<E> = javafx.beans.binding.SetExpression<E>
typealias MapExpression<K, V> = javafx.beans.binding.MapExpression<K, V>

inline class When(val source: JFXWhen) {
    constructor(condition: ObservableBooleanValue) : this(JFXWhen(condition))

    /**
     * If-then-else expression returning a number.
     * @see javafx.beans.binding.When.NumberConditionBuilder
     */
    inline class NumberConditionBuilder(val source: JFXWhen.NumberConditionBuilder) {
        inline infix fun otherwise(otherwiseValue: ObservableNumberValue): NumberBinding = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: Double): NumberBinding = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: Float): NumberBinding = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: Long): NumberBinding = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: Int): NumberBinding = source.otherwise(otherwiseValue)
    }

    inline infix fun then(thenValue: ObservableNumberValue): NumberConditionBuilder = NumberConditionBuilder(source.then(thenValue))
    inline infix fun then(thenValue: Double): NumberConditionBuilder = NumberConditionBuilder(source.then(thenValue))
    inline infix fun then(thenValue: Float): NumberConditionBuilder = NumberConditionBuilder(source.then(thenValue))
    inline infix fun then(thenValue: Long): NumberConditionBuilder = NumberConditionBuilder(source.then(thenValue))
    inline infix fun then(thenValue: Int): NumberConditionBuilder = NumberConditionBuilder(source.then(thenValue))

    /**
     * An intermediate class needed while assembling the ternary expression. It
     * should not be used in another context.
     * @see javafx.beans.binding.When.BooleanConditionBuilder
     */
    inline class BooleanConditionBuilder(val source: JFXWhen.BooleanConditionBuilder) {
        inline infix fun otherwise(otherwiseValue: ObservableBooleanValue): BooleanBinding = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: Boolean): BooleanBinding = source.otherwise(otherwiseValue)
    }

    inline infix fun then(thenValue: ObservableBooleanValue): BooleanConditionBuilder = BooleanConditionBuilder(source.then(thenValue))
    inline infix fun then(thenValue: Boolean): BooleanConditionBuilder = BooleanConditionBuilder(source.then(thenValue))

    /**
     * An intermediate class needed while assembling the ternary expression. It
     * should not be used in another context.
     * @see javafx.beans.binding.When.StringConditionBuilder
     */
    inline class StringConditionBuilder(val source: JFXWhen.StringConditionBuilder) {
        inline infix fun otherwise(otherwiseValue: ObservableStringValue): StringBinding = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: String): StringBinding = source.otherwise(otherwiseValue)
    }

    inline infix fun then(thenValue: ObservableStringValue): StringConditionBuilder = StringConditionBuilder(source.then(thenValue))
    inline infix fun then(thenValue: String): StringConditionBuilder = StringConditionBuilder(source.then(thenValue))

    /**
     * An intermediate class needed while assembling the ternary expression. It
     * should not be used in another context.
     * @see javafx.beans.binding.When.ObjectConditionBuilder
     */
    inline class ObjectConditionBuilder<T>(val source: JFXWhen.ObjectConditionBuilder<T>) {
        inline infix fun otherwise(otherwiseValue: ObservableObjectValue<T>): ObjectBinding<T> = source.otherwise(otherwiseValue)
        inline infix fun otherwise(otherwiseValue: T): ObjectBinding<T> = source.otherwise(otherwiseValue)
    }

    inline infix fun <T> then(thenValue: ObservableObjectValue<T>): ObjectConditionBuilder<T> = ObjectConditionBuilder(source.then(thenValue))
    inline infix fun <T> then(thenValue: T): ObjectConditionBuilder<T> = ObjectConditionBuilder(source.then(thenValue))

}

//region Helper functions to create custom bindings

inline fun createBooleanBinding(vararg dependencies: Observable, crossinline func: () -> Boolean): BooleanBinding =
        Bindings.createBooleanBinding(Callable { func() }, *dependencies)

inline fun createDoubleBinding(vararg dependencies: Observable, crossinline func: () -> Double): DoubleBinding =
        Bindings.createDoubleBinding(Callable { func() }, *dependencies)

inline fun createFloatBinding(vararg dependencies: Observable, crossinline func: () -> Float): FloatBinding =
        Bindings.createFloatBinding(Callable { func() }, *dependencies)

inline fun createIntegerBinding(vararg dependencies: Observable, crossinline func: () -> Int): IntegerBinding =
        Bindings.createIntegerBinding(Callable { func() }, *dependencies)

inline fun createLongBinding(vararg dependencies: Observable, crossinline func: () -> Long): LongBinding =
        Bindings.createLongBinding(Callable { func() }, *dependencies)

inline fun <T> createObjectBinding(vararg dependencies: Observable, crossinline func: () -> T): ObjectBinding<T> =
        Bindings.createObjectBinding(Callable { func() }, *dependencies)

inline fun createStringBinding(vararg dependencies: Observable, crossinline func: () -> String): StringBinding =
        Bindings.createStringBinding(Callable { func() }, *dependencies)

//endregion

//region Select Bindings

inline fun <T> ObservableValue<*>.select(vararg steps: String): ObjectBinding<T> =
        Bindings.select(this, *steps)

inline fun ObservableValue<*>.selectDouble(vararg steps: String): DoubleBinding =
        Bindings.selectDouble(this, *steps)

inline fun ObservableValue<*>.selectFloat(vararg steps: String): FloatBinding =
        Bindings.selectFloat(this, *steps)

inline fun ObservableValue<*>.selectInteger(vararg steps: String): IntegerBinding =
        Bindings.selectInteger(this, *steps)

inline fun ObservableValue<*>.selectLong(vararg steps: String): LongBinding =
        Bindings.selectLong(this, *steps)

inline fun ObservableValue<*>.selectBoolean(vararg steps: String): BooleanBinding =
        Bindings.selectBoolean(this, *steps)

inline fun ObservableValue<*>.selectString(vararg steps: String): StringBinding =
        Bindings.selectString(this, *steps)

inline fun <T> select(root: Any, vararg steps: String): ObjectBinding<T> =
        Bindings.select(root, *steps)

inline fun selectDouble(root: Any, vararg steps: String): DoubleBinding =
        Bindings.selectDouble(root, *steps)

inline fun selectFloat(root: Any, vararg steps: String): FloatBinding =
        Bindings.selectFloat(root, *steps)

inline fun selectInteger(root: Any, vararg steps: String): IntegerBinding =
        Bindings.selectInteger(root, *steps)

inline fun selectLong(root: Any, vararg steps: String): LongBinding =
        Bindings.selectLong(root, *steps)

inline fun selectBoolean(root: Any, vararg steps: String): BooleanBinding =
        Bindings.selectBoolean(root, *steps)

inline fun selectString(root: Any, vararg steps: String): StringBinding =
        Bindings.selectString(root, *steps)

//endregion

//region Operators

inline operator fun NumberExpression.unaryMinus(): NumberBinding = this.negate()

inline operator fun NumberExpression.plus(other: ObservableNumberValue): NumberBinding = this.add(other)

inline operator fun NumberExpression.plus(other: Double): NumberBinding = this.add(other)

inline operator fun NumberExpression.plus(other: Float): NumberBinding = this.add(other)

inline operator fun NumberExpression.plus(other: Long): NumberBinding = this.add(other)

inline operator fun NumberExpression.plus(other: Int): NumberBinding = this.add(other)

inline operator fun NumberExpression.minus(other: ObservableNumberValue): NumberBinding = this.subtract(other)

inline operator fun NumberExpression.minus(other: Double): NumberBinding = this.subtract(other)

inline operator fun NumberExpression.minus(other: Float): NumberBinding = this.subtract(other)

inline operator fun NumberExpression.minus(other: Long): NumberBinding = this.subtract(other)

inline operator fun NumberExpression.minus(other: Int): NumberBinding = this.subtract(other)

inline operator fun NumberExpression.times(other: ObservableNumberValue): NumberBinding = this.multiply(other)

inline operator fun NumberExpression.times(other: Double): NumberBinding = this.multiply(other)

inline operator fun NumberExpression.times(other: Float): NumberBinding = this.multiply(other)

inline operator fun NumberExpression.times(other: Long): NumberBinding = this.multiply(other)

inline operator fun NumberExpression.times(other: Int): NumberBinding = this.multiply(other)

inline operator fun NumberExpression.div(other: ObservableNumberValue): NumberBinding = this.divide(other)

inline operator fun NumberExpression.div(other: Double): NumberBinding = this.divide(other)

inline operator fun NumberExpression.div(other: Float): NumberBinding = this.divide(other)

inline operator fun NumberExpression.div(other: Long): NumberBinding = this.divide(other)

inline operator fun NumberExpression.div(other: Int): NumberBinding = this.divide(other)


inline operator fun FloatExpression.unaryMinus(): FloatBinding = this.negate()

inline operator fun FloatExpression.plus(other: Double): DoubleBinding = this.add(other)

inline operator fun FloatExpression.plus(other: Float): FloatBinding = this.add(other)

inline operator fun FloatExpression.plus(other: Long): FloatBinding = this.add(other)

inline operator fun FloatExpression.plus(other: Int): FloatBinding = this.add(other)

inline operator fun FloatExpression.minus(other: Double): DoubleBinding = this.subtract(other)

inline operator fun FloatExpression.minus(other: Float): FloatBinding = this.subtract(other)

inline operator fun FloatExpression.minus(other: Long): FloatBinding = this.subtract(other)

inline operator fun FloatExpression.minus(other: Int): FloatBinding = this.subtract(other)

inline operator fun FloatExpression.times(other: Double): DoubleBinding = this.multiply(other)

inline operator fun FloatExpression.times(other: Float): FloatBinding = this.multiply(other)

inline operator fun FloatExpression.times(other: Long): FloatBinding = this.multiply(other)

inline operator fun FloatExpression.times(other: Int): FloatBinding = this.multiply(other)

inline operator fun FloatExpression.div(other: Double): DoubleBinding = this.divide(other)

inline operator fun FloatExpression.div(other: Float): FloatBinding = this.divide(other)

inline operator fun FloatExpression.div(other: Long): FloatBinding = this.divide(other)

inline operator fun FloatExpression.div(other: Int): FloatBinding = this.divide(other)


inline operator fun DoubleExpression.unaryMinus(): DoubleBinding = this.negate()

inline operator fun DoubleExpression.plus(other: ObservableNumberValue): DoubleBinding = this.add(other)

inline operator fun DoubleExpression.plus(other: Double): DoubleBinding = this.add(other)

inline operator fun DoubleExpression.plus(other: Float): DoubleBinding = this.add(other)

inline operator fun DoubleExpression.plus(other: Long): DoubleBinding = this.add(other)

inline operator fun DoubleExpression.plus(other: Int): DoubleBinding = this.add(other)

inline operator fun DoubleExpression.minus(other: ObservableNumberValue): DoubleBinding = this.subtract(other)

inline operator fun DoubleExpression.minus(other: Double): DoubleBinding = this.subtract(other)

inline operator fun DoubleExpression.minus(other: Float): DoubleBinding = this.subtract(other)

inline operator fun DoubleExpression.minus(other: Long): DoubleBinding = this.subtract(other)

inline operator fun DoubleExpression.minus(other: Int): DoubleBinding = this.subtract(other)

inline operator fun DoubleExpression.times(other: ObservableNumberValue): DoubleBinding = this.multiply(other)

inline operator fun DoubleExpression.times(other: Double): DoubleBinding = this.multiply(other)

inline operator fun DoubleExpression.times(other: Float): DoubleBinding = this.multiply(other)

inline operator fun DoubleExpression.times(other: Long): DoubleBinding = this.multiply(other)

inline operator fun DoubleExpression.times(other: Int): DoubleBinding = this.multiply(other)

inline operator fun DoubleExpression.div(other: ObservableNumberValue): DoubleBinding = this.divide(other)

inline operator fun DoubleExpression.div(other: Double): DoubleBinding = this.divide(other)

inline operator fun DoubleExpression.div(other: Float): DoubleBinding = this.divide(other)

inline operator fun DoubleExpression.div(other: Long): DoubleBinding = this.divide(other)

inline operator fun DoubleExpression.div(other: Int): DoubleBinding = this.divide(other)


inline operator fun IntegerExpression.unaryMinus(): IntegerBinding = this.negate()

inline operator fun IntegerExpression.plus(other: Double): DoubleBinding = this.add(other)

inline operator fun IntegerExpression.plus(other: Float): FloatBinding = this.add(other)

inline operator fun IntegerExpression.plus(other: Long): LongBinding = this.add(other)

inline operator fun IntegerExpression.plus(other: Int): IntegerBinding = this.add(other)

inline operator fun IntegerExpression.minus(other: Double): DoubleBinding = this.subtract(other)

inline operator fun IntegerExpression.minus(other: Float): FloatBinding = this.subtract(other)

inline operator fun IntegerExpression.minus(other: Long): LongBinding = this.subtract(other)

inline operator fun IntegerExpression.minus(other: Int): IntegerBinding = this.subtract(other)

inline operator fun IntegerExpression.times(other: Double): DoubleBinding = this.multiply(other)

inline operator fun IntegerExpression.times(other: Float): FloatBinding = this.multiply(other)

inline operator fun IntegerExpression.times(other: Long): LongBinding = this.multiply(other)

inline operator fun IntegerExpression.times(other: Int): IntegerBinding = this.multiply(other)

inline operator fun IntegerExpression.div(other: Double): DoubleBinding = this.divide(other)

inline operator fun IntegerExpression.div(other: Float): FloatBinding = this.divide(other)

inline operator fun IntegerExpression.div(other: Long): LongBinding = this.divide(other)

inline operator fun IntegerExpression.div(other: Int): IntegerBinding = this.divide(other)


inline operator fun LongExpression.unaryMinus(): LongBinding = this.negate()

inline operator fun LongExpression.plus(other: Double): DoubleBinding = this.add(other)

inline operator fun LongExpression.plus(other: Float): FloatBinding = this.add(other)

inline operator fun LongExpression.plus(other: Long): LongBinding = this.add(other)

inline operator fun LongExpression.plus(other: Int): LongBinding = this.add(other)

inline operator fun LongExpression.minus(other: Double): DoubleBinding = this.subtract(other)

inline operator fun LongExpression.minus(other: Float): FloatBinding = this.subtract(other)

inline operator fun LongExpression.minus(other: Long): LongBinding = this.subtract(other)

inline operator fun LongExpression.minus(other: Int): LongBinding = this.subtract(other)

inline operator fun LongExpression.times(other: Double): DoubleBinding = this.multiply(other)

inline operator fun LongExpression.times(other: Float): FloatBinding = this.multiply(other)

inline operator fun LongExpression.times(other: Long): LongBinding = this.multiply(other)

inline operator fun LongExpression.times(other: Int): LongBinding = this.multiply(other)

inline operator fun LongExpression.div(other: Double): DoubleBinding = this.divide(other)

inline operator fun LongExpression.div(other: Float): FloatBinding = this.divide(other)

inline operator fun LongExpression.div(other: Long): LongBinding = this.divide(other)

inline operator fun LongExpression.div(other: Int): LongBinding = this.divide(other)

//endregion

val ObservableObjectValue<*>.isNull: BooleanBinding
    inline get() = Bindings.isNull(this)

val ObservableObjectValue<*>.isNotNull: BooleanBinding
    inline get() = Bindings.isNotNull(this)