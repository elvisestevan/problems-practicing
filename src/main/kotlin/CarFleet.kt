package org.example

class CarFleet {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

        var cars = mutableListOf<Pair<Int, Int>>()

        for (i in position.indices) {
            cars.add(Pair(position[i], speed[i]))
        }
        cars.sortBy { (first, _) -> first }

        println(cars)

        return 0;

    }
}