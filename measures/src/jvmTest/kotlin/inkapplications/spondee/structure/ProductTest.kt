package inkapplications.spondee.structure

import inkapplications.spondee.measure.A
import inkapplications.spondee.measure.B
import org.junit.Test
import kotlin.test.assertEquals

class ProductTest {
    @Test
    fun math() {
        assertEquals(A(1.5), (A(2.0) * B(3.0)) / B(4.0))
    }
}