package inkapplications.spondee.spatial

import inkapplications.spondee.structure.DoubleMeasure
import kotlin.jvm.JvmInline
import kotlin.math.PI

/**
 * Unit of angle or bearing.
 */
interface Angle: DoubleMeasure<Angle> {
    /**
     * Express the angle in degrees.
     */
    val inDegrees: Double

    /**
     * Express the angle in radians.
     */
    val inRadians: Double
}

@JvmInline
internal value class Degrees(override val inDegrees: Double): Angle {
    override val inRadians: Double get() = inDegrees * (PI / 180)
    override fun convert(value: Angle): Double = value.inDegrees
    override fun create(value: Double): Angle = Degrees(value)

    override fun toString(): String = "${inDegrees}º"
}

/**
 * Express a number as Angle in degrees.
 */
val Number.degrees: Angle get() = Degrees(toDouble())
val degree = 1.degrees

@JvmInline
internal value class Radians(override val inRadians: Double): Angle {
    override val inDegrees: Double get() = inRadians * (180 / PI)
    override fun convert(value: Angle): Double = value.inRadians
    override fun create(value: Double): Angle = Radians(value)

    override fun toString(): String = inRadians.toString()
}

/**
 * Express a number as an Angle in radians.
 */
val Number.radians: Angle get() = Radians(toDouble())
val radian = 1.radians
