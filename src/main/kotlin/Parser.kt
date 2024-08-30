package org.example

class Parser {

    fun duplicateCount(text: String): Int {

        return text.toCharArray().groupBy { c -> c }.filter { (k, v) -> (v.size > 1) }.size

    }

}