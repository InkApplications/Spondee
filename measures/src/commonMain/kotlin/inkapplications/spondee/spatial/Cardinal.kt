package inkapplications.spondee.spatial

/**
 * Geographic Direction
 */
enum class Cardinal(val symbol: Char, internal val decimalSign: Int) {
    North('N', 1),
    East('E', 1),
    South('S', -1),
    West('W', -1);

    override fun toString(): String = "$symbol"
}

/**
 * Convert a single character to a cardinal direction.
 */
fun Char.toCardinal(): Cardinal = Cardinal.values().first { it.symbol == uppercaseChar() }