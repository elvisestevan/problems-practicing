package org.example

import kotlin.math.sqrt

class DetonateTheMaximumBombs {

    fun maximumDetonation(bombs: Array<IntArray>): Int {

        val disjoinSetUnion = DisjoinSetUnion(bombs.size)

        for (i in bombs.indices) {
            for (j in bombs.indices) {
                if (i != j && isInside(bombs[i], bombs[j])) {
                    println("${bombs[i].toList()} ${bombs[j].toList()} intersected")
                    disjoinSetUnion.join(i, j);
                }
            }
        }

        return disjoinSetUnion.parent.toList().groupingBy { it }.eachCount().maxBy { it.value }.value;

    }

    private fun isInside(bombA: IntArray, bombB: IntArray): Boolean {

        val distance = sqrt(((bombA[0] - bombB[0]) * (bombA[0] - bombB[0]) + (bombA[1] - bombB[1]) * (bombA[1] - bombB[1])).toDouble())

        return distance <= bombA[2];

    }


    class DisjoinSetUnion(private val numberOfBombs: Int) {

        val parent = IntArray(numberOfBombs)
        private val size = IntArray(numberOfBombs)

        init {
            makeSet();
        }

        private fun makeSet() {
            for (i in 0  until numberOfBombs) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        private fun findParent(x: Int): Int {
            if (parent[x] == x) return parent[x];
            return findParent(parent[x]);
        }

        fun join(x: Int, y: Int): Boolean {
            val (xP, yP) = findParent(x) to findParent(y);
            if (xP == yP) return false;
            if (size[xP] > size[yP]) {
                size[xP] += size[yP]
                parent[yP] = xP
            } else {
                size[yP] += size[xP]
                parent[xP] = yP
            }
            return true;
        }

    }

}

