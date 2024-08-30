package org.example

class FairDistributionOfCookies {

    fun distributeCookies(cookies: IntArray, k: Int): Int {
        val buckets = IntArray(k){ 0 }
        fun helper(idx: Int): Int {
            if (idx == cookies.size) {
                return buckets.max() ?: Int.MAX_VALUE
            }

            var result = Int.MAX_VALUE

            for (i in 0 until k) {
                buckets[i] += cookies[idx]
                result = Math.min(result, helper(idx + 1))
                buckets[i] -= cookies[idx]
            }

            return result
        }

        return helper(0)
    }

}