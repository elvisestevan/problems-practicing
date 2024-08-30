package org.example

class Parser {

    fun duplicateCount(text: String): Int {

        return text.toCharArray().groupBy { c -> c.lowercaseChar() }.filter { (k, v) -> (v.size > 1) }.size

    }

    fun repeatedCount(text: String): Int {

        return text.toCharArray().groupBy { c -> c.lowercaseChar() }.filter { (k, v) -> v.size > 1 }.map { (_, v) -> v.size }.sum()

    }

}