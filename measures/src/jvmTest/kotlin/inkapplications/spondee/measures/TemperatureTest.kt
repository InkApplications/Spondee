package inkapplications.spondee.measures

import org.junit.Test
import kotlin.test.assertEquals

class TemperatureTest {
    @Test
    fun conversions() {
        12.kelvin.run {
            assertEquals(12.0, inKelvin)
            assertEquals(-438.07, inFahrenheit, 0.001)
            assertEquals(-261.15, inCelsius, 0.001)
        }

        12.fahrenheit.run {
            assertEquals(12.0, inFahrenheit)
            assertEquals(262.0389, inKelvin, 0.0001)
            assertEquals(-11.11111, inCelsius, 0.00001)
        }

        12.celsius.run {
            assertEquals(12.0, inCelsius)
            assertEquals(285.15, inKelvin, 0.001)
            assertEquals(53.6, inFahrenheit, 0.01)
        }
    }
}