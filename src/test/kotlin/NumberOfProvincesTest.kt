import org.example.NumberOfProvinces
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumberOfProvincesTest {

    val numberOfProvinces = NumberOfProvinces();

    @Test
    fun findCircleNum() {

        assertEquals(1, numberOfProvinces.findCircleNum(
            arrayOf(
                arrayOf(1, 1, 1).toIntArray(),
                arrayOf(1, 1, 1).toIntArray(),
                arrayOf(1, 1, 1).toIntArray(),
            )
        ))

        assertEquals(3, numberOfProvinces.findCircleNum(
            arrayOf(
                arrayOf(1, 0, 0).toIntArray(),
                arrayOf(0, 1, 0).toIntArray(),
                arrayOf(0, 0, 1).toIntArray(),
            )
        ))

        assertEquals(2, numberOfProvinces.findCircleNum(
            arrayOf(
                arrayOf(1, 1, 0).toIntArray(),
                arrayOf(1, 1, 0).toIntArray(),
                arrayOf(0, 0, 1).toIntArray(),
            )
        ))

    }
}