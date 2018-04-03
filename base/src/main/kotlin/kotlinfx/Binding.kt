package kotlinfx

import javafx.beans.binding.*
import javafx.beans.value.*

operator fun NumberExpression.unaryMinus(): NumberBinding = this.negate()

operator fun NumberExpression.plus(other: ObservableNumberValue): NumberBinding = this.add(other)

operator fun NumberExpression.plus(other: Double): NumberBinding = this.add(other)

operator fun NumberExpression.plus(other: Float): NumberBinding = this.add(other)

operator fun NumberExpression.plus(other: Long): NumberBinding = this.add(other)

operator fun NumberExpression.plus(other: Int): NumberBinding = this.add(other)

operator fun NumberExpression.minus(other: ObservableNumberValue): NumberBinding = this.subtract(other)

operator fun NumberExpression.minus(other: Double): NumberBinding = this.subtract(other)

operator fun NumberExpression.minus(other: Float): NumberBinding = this.subtract(other)

operator fun NumberExpression.minus(other: Long): NumberBinding = this.subtract(other)

operator fun NumberExpression.minus(other: Int): NumberBinding = this.subtract(other)

operator fun NumberExpression.times(other: ObservableNumberValue): NumberBinding = this.multiply(other)

operator fun NumberExpression.times(other: Double): NumberBinding = this.multiply(other)

operator fun NumberExpression.times(other: Float): NumberBinding = this.multiply(other)

operator fun NumberExpression.times(other: Long): NumberBinding = this.multiply(other)

operator fun NumberExpression.times(other: Int): NumberBinding = this.multiply(other)

operator fun NumberExpression.div(other: ObservableNumberValue): NumberBinding = this.divide(other)

operator fun NumberExpression.div(other: Double): NumberBinding = this.divide(other)

operator fun NumberExpression.div(other: Float): NumberBinding = this.divide(other)

operator fun NumberExpression.div(other: Long): NumberBinding = this.divide(other)

operator fun NumberExpression.div(other: Int): NumberBinding = this.divide(other)


operator fun FloatExpression.unaryMinus(): FloatBinding = this.negate()

operator fun FloatExpression.plus(other: Double): DoubleBinding = this.add(other)

operator fun FloatExpression.plus(other: Float): FloatBinding = this.add(other)

operator fun FloatExpression.plus(other: Long): FloatBinding = this.add(other)

operator fun FloatExpression.plus(other: Int): FloatBinding = this.add(other)

operator fun FloatExpression.minus(other: Double): DoubleBinding = this.subtract(other)

operator fun FloatExpression.minus(other: Float): FloatBinding = this.subtract(other)

operator fun FloatExpression.minus(other: Long): FloatBinding = this.subtract(other)

operator fun FloatExpression.minus(other: Int): FloatBinding = this.subtract(other)

operator fun FloatExpression.times(other: Double): DoubleBinding = this.multiply(other)

operator fun FloatExpression.times(other: Float): FloatBinding = this.multiply(other)

operator fun FloatExpression.times(other: Long): FloatBinding = this.multiply(other)

operator fun FloatExpression.times(other: Int): FloatBinding = this.multiply(other)

operator fun FloatExpression.div(other: Double): DoubleBinding = this.divide(other)

operator fun FloatExpression.div(other: Float): FloatBinding = this.divide(other)

operator fun FloatExpression.div(other: Long): FloatBinding = this.divide(other)

operator fun FloatExpression.div(other: Int): FloatBinding = this.divide(other)


operator fun DoubleExpression.unaryMinus(): DoubleBinding = this.negate()

operator fun DoubleExpression.plus(other: ObservableNumberValue): DoubleBinding = this.add(other)

operator fun DoubleExpression.plus(other: Double): DoubleBinding = this.add(other)

operator fun DoubleExpression.plus(other: Float): DoubleBinding = this.add(other)

operator fun DoubleExpression.plus(other: Long): DoubleBinding = this.add(other)

operator fun DoubleExpression.plus(other: Int): DoubleBinding = this.add(other)

operator fun DoubleExpression.minus(other: ObservableNumberValue): DoubleBinding = this.subtract(other)

operator fun DoubleExpression.minus(other: Double): DoubleBinding = this.subtract(other)

operator fun DoubleExpression.minus(other: Float): DoubleBinding = this.subtract(other)

operator fun DoubleExpression.minus(other: Long): DoubleBinding = this.subtract(other)

operator fun DoubleExpression.minus(other: Int): DoubleBinding = this.subtract(other)

operator fun DoubleExpression.times(other: ObservableNumberValue): DoubleBinding = this.multiply(other)

operator fun DoubleExpression.times(other: Double): DoubleBinding = this.multiply(other)

operator fun DoubleExpression.times(other: Float): DoubleBinding = this.multiply(other)

operator fun DoubleExpression.times(other: Long): DoubleBinding = this.multiply(other)

operator fun DoubleExpression.times(other: Int): DoubleBinding = this.multiply(other)

operator fun DoubleExpression.div(other: ObservableNumberValue): DoubleBinding = this.divide(other)

operator fun DoubleExpression.div(other: Double): DoubleBinding = this.divide(other)

operator fun DoubleExpression.div(other: Float): DoubleBinding = this.divide(other)

operator fun DoubleExpression.div(other: Long): DoubleBinding = this.divide(other)

operator fun DoubleExpression.div(other: Int): DoubleBinding = this.divide(other)


operator fun IntegerExpression.unaryMinus(): IntegerBinding = this.negate()

operator fun IntegerExpression.plus(other: Double): DoubleBinding = this.add(other)

operator fun IntegerExpression.plus(other: Float): FloatBinding = this.add(other)

operator fun IntegerExpression.plus(other: Long): LongBinding = this.add(other)

operator fun IntegerExpression.plus(other: Int): IntegerBinding = this.add(other)

operator fun IntegerExpression.minus(other: Double): DoubleBinding = this.subtract(other)

operator fun IntegerExpression.minus(other: Float): FloatBinding = this.subtract(other)

operator fun IntegerExpression.minus(other: Long): LongBinding = this.subtract(other)

operator fun IntegerExpression.minus(other: Int): IntegerBinding = this.subtract(other)

operator fun IntegerExpression.times(other: Double): DoubleBinding = this.multiply(other)

operator fun IntegerExpression.times(other: Float): FloatBinding = this.multiply(other)

operator fun IntegerExpression.times(other: Long): LongBinding = this.multiply(other)

operator fun IntegerExpression.times(other: Int): IntegerBinding = this.multiply(other)

operator fun IntegerExpression.div(other: Double): DoubleBinding = this.divide(other)

operator fun IntegerExpression.div(other: Float): FloatBinding = this.divide(other)

operator fun IntegerExpression.div(other: Long): LongBinding = this.divide(other)

operator fun IntegerExpression.div(other: Int): IntegerBinding = this.divide(other)


operator fun LongExpression.unaryMinus(): LongBinding = this.negate()

operator fun LongExpression.plus(other: Double): DoubleBinding = this.add(other)

operator fun LongExpression.plus(other: Float): FloatBinding = this.add(other)

operator fun LongExpression.plus(other: Long): LongBinding = this.add(other)

operator fun LongExpression.plus(other: Int): LongBinding = this.add(other)

operator fun LongExpression.minus(other: Double): DoubleBinding = this.subtract(other)

operator fun LongExpression.minus(other: Float): FloatBinding = this.subtract(other)

operator fun LongExpression.minus(other: Long): LongBinding = this.subtract(other)

operator fun LongExpression.minus(other: Int): LongBinding = this.subtract(other)

operator fun LongExpression.times(other: Double): DoubleBinding = this.multiply(other)

operator fun LongExpression.times(other: Float): FloatBinding = this.multiply(other)

operator fun LongExpression.times(other: Long): LongBinding = this.multiply(other)

operator fun LongExpression.times(other: Int): LongBinding = this.multiply(other)

operator fun LongExpression.div(other: Double): DoubleBinding = this.divide(other)

operator fun LongExpression.div(other: Float): FloatBinding = this.divide(other)

operator fun LongExpression.div(other: Long): LongBinding = this.divide(other)

operator fun LongExpression.div(other: Int): LongBinding = this.divide(other)