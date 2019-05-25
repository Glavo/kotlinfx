@file:Suppress("NOTHING_TO_INLINE")

package kotlinfx

import javafx.beans.*
import javafx.beans.binding.*
import javafx.beans.value.*
import java.util.concurrent.Callable

inline fun Observable.createBooleanBinding(crossinline func: () -> Boolean): BooleanBinding =
        Bindings.createBooleanBinding(Callable { func() }, this)

inline fun Observable.createDoubleBinding(crossinline func: () -> Double): DoubleBinding =
        Bindings.createDoubleBinding(Callable { func() }, this)

inline fun Observable.createFloatBinding(crossinline func: () -> Float): FloatBinding =
        Bindings.createFloatBinding(Callable { func() }, this)

inline fun Observable.createIntegerBinding(crossinline func: () -> Int): IntegerBinding =
        Bindings.createIntegerBinding(Callable { func() }, this)

inline fun Observable.createLongBinding(crossinline func: () -> Long): LongBinding =
        Bindings.createLongBinding(Callable { func() }, this)

inline fun <T> Observable.createObjectBinding(crossinline func: () -> T): ObjectBinding<T> =
        Bindings.createObjectBinding(Callable { func() }, this)

inline fun Observable.createStringBinding(crossinline func: () -> String): StringBinding =
        Bindings.createStringBinding(Callable { func() }, this)

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

val ObservableObjectValue<*>.isNull: BooleanBinding
    inline get() = Bindings.isNull(this)

val ObservableObjectValue<*>.isNotNull: BooleanBinding
    inline get() = Bindings.isNotNull(this)