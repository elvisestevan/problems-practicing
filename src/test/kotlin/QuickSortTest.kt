import org.example.QuickSort
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QuickSortTest {

    val quickSort = QuickSort()

    @Test
    fun `should sort an array`() {
        val numbers = intArrayOf(3, 2, 5, 0, 1, 8, 7, 6, 9, 4)
        val numbers2 = intArrayOf(3, 3, 3, 1, 1, 1, 2, 2, 2, 2)
        val numbers3 = intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)

        quickSort.sort(numbers, 0, 9)
        quickSort.sort(numbers2, 0, 9)
        quickSort.sort(numbers3, 0, 9)

        assertTrue(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) contentEquals numbers)
        assertTrue(intArrayOf(1, 1, 1, 2, 2, 2, 2, 3, 3, 3) contentEquals numbers2)
        assertTrue(intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) contentEquals numbers3)
    }

}