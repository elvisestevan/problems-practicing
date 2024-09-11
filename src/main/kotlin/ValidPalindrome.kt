package org.example

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {

        val newPhrase = s.replace(Regex("[^A-Za-z0-9]"), "").lowercase()

        println(newPhrase)

        return true
    }
}