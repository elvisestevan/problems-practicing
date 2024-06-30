import org.example.DetonateTheMaximumBombs
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DetonateTheMaximumBombsTest {

    val detonateTheMaximumBombs = DetonateTheMaximumBombs()

    @Test
    fun maximumDetonation() {

        assertEquals(2, detonateTheMaximumBombs.maximumDetonation(
            arrayOf(
                arrayOf(2, 1, 3).toIntArray(),
                arrayOf(6, 1, 4).toIntArray(),
            )
        ))

        assertEquals(1, detonateTheMaximumBombs.maximumDetonation(
            arrayOf(
                arrayOf(1, 1, 5).toIntArray(),
                arrayOf(10, 10, 5).toIntArray(),
            )
        ))

        assertEquals(5, detonateTheMaximumBombs.maximumDetonation(
            arrayOf(
                arrayOf(1, 2, 3).toIntArray(),
                arrayOf(2, 3, 1).toIntArray(),
                arrayOf(3, 4, 2).toIntArray(),
                arrayOf(4, 5, 3).toIntArray(),
                arrayOf(5, 6, 4).toIntArray(),
            )
        ))

        assertEquals(1, detonateTheMaximumBombs.maximumDetonation(
            arrayOf(
                arrayOf(54,95,4).toIntArray(),
                arrayOf(99,46,3).toIntArray(),
                arrayOf(29,21,3).toIntArray(),
                arrayOf(96,72,8).toIntArray(),
                arrayOf(49,43,3).toIntArray(),
                arrayOf(11,20,3).toIntArray(),
                arrayOf(2,57,1).toIntArray(),
                arrayOf(69,51,7).toIntArray(),
                arrayOf(97,1,10).toIntArray(),
                arrayOf(85,45,2).toIntArray(),
                arrayOf(38,47,1).toIntArray(),
                arrayOf(83,75,3).toIntArray(),
                arrayOf(65,59,3).toIntArray(),
                arrayOf(33,4,1).toIntArray(),
                arrayOf(32,10,2).toIntArray(),
                arrayOf(20,97,8).toIntArray(),
                arrayOf(35,37,3).toIntArray(),
            )
        ))

    }
}