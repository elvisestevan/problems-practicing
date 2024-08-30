import org.example.Parser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ParserTest {

    private val parser = Parser()

    @Test
    fun duplicateCount() {

        assertEquals(0, parser.duplicateCount("abcde"))
        assertEquals(1, parser.duplicateCount("abcdea"))
        assertEquals(1, parser.duplicateCount("Aa"))
        assertEquals(1, parser.duplicateCount("indivisibility"))
        val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
        assertEquals(3, parser.duplicateCount(text))

    }

    @Test
    fun repeatedCount() {
        assertEquals(0, parser.repeatedCount("abcde"))
        assertEquals(2, parser.repeatedCount("abcdea"))
        assertEquals(6, parser.repeatedCount("indivisibility"))
        val text = "dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)
        assertEquals(10 + 100 + 1001, parser.repeatedCount(text))
    }

    @Test
    fun fibonacci() {
        assertEquals(listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34), parser.fibonacci())
        assertEquals(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), generateSequence(0) { it + 1 }.take(10).toList())
    }

    @Test
    fun basketballScore() {
        assertEquals(mapOf(Parser.Team.YELLOW to 85, Parser.Team.BLUE to 84), parser.basketballScore())
    }

    @Test
    fun maxNumberOfSteps() {
        assertEquals(75, parser.maxNumberOfSteps())
    }

    @Test
    fun fastestStage() {
        assertEquals(4, parser.fastestStage())
    }
}