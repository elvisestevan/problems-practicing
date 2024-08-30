package org.example

class Parser {

    fun duplicateCount(text: String): Int {

        return text.toCharArray().groupBy { c -> c.lowercaseChar() }.filter { (k, v) -> (v.size > 1) }.size

    }

    fun repeatedCount(text: String): Int {

        return text.toCharArray().groupBy { c -> c.lowercaseChar() }.filter { (k, v) -> v.size > 1 }.map { (_, v) -> v.size }.sum()

    }

    fun fibonacci(): List<Int> =
        generateSequence(Pair(0, 1)) { it -> Pair(it.second, it.first + it.second) }.take(10).map { it.first }.toList()

    fun basketballScore(): Map<Team, Int> {
        val match = listOf(
            PlayerGame("13", Team.YELLOW, 12),
            PlayerGame("7", Team.YELLOW, 7),
            PlayerGame("3", Team.YELLOW, 20),
            PlayerGame("22", Team.YELLOW, 16),
            PlayerGame("33", Team.YELLOW, 4),
            PlayerGame("45", Team.YELLOW, 26),
            PlayerGame("8", Team.BLUE, 17),
            PlayerGame("3", Team.BLUE, 15),
            PlayerGame("21", Team.BLUE, 16),
            PlayerGame("30", Team.BLUE, 12),
            PlayerGame("45", Team.BLUE, 24)
        )

        //return match.groupBy { it.team }.map { it.key to it.value.sumOf { item -> item.points } }.toMap()
        return match.groupingBy { it.team }.fold(0) { accumulator, element -> accumulator + element.points }

    }

    fun maxNumberOfSteps(): Int =
        listOf (
            0, 71, 140, 212, 283, 358, 430, 501, 575, 640, 708, 780
        ).zipWithNext { a, b -> b - a }.max()

    fun fastestStage(): Int {
        data class Measure (
            val number : Int,
            val secondsAcc : Int,
            val metersAcc : Int
        )
        val measures = mutableListOf (
            Measure(0, 0, 0),
            Measure(1, 302, 8090),
            Measure(2, 689, 17655),
            Measure(3, 1204, 32655),
            Measure(4, 1425, 39884)
        )

        return measures.zipWithNext { a, b -> b.number to ((b.metersAcc - a.metersAcc) / (b.secondsAcc - a.secondsAcc)) }.maxBy { it.second }.first
    }


    enum class Team {
        YELLOW, BLUE
    }
    data class PlayerGame (
        val player : String,
        val team : Team,
        val points : Int
    )


}