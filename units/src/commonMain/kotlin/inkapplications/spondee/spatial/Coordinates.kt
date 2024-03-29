package inkapplications.spondee.spatial

/**
 * Two-point numerical position.
 */
data class Coordinates(
    val x: Number,
    val y: Number,
) {
    override fun toString(): String = "[$x, $y]"
}
