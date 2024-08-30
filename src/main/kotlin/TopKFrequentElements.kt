package org.example

class TopKFrequentElements {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val countMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            if (num in countMap){
                countMap[num] = countMap[num]?.plus(1)!!
            } else {
                countMap[num] = 1
            }
        }

        val sortedMap = countMap.toList().sortedBy { (_, value) -> -value }.toMap()

        val result = sortedMap.keys.take(k).toIntArray()

        return result

    }
}