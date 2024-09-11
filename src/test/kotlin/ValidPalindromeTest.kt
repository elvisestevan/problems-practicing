import org.example.ValidPalindrome
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ValidPalindromeTest {

    val validPalindrome = ValidPalindrome()

    @Test
    fun isPalindrome() {

        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
        assertFalse(validPalindrome.isPalindrome(" "))

    }
}