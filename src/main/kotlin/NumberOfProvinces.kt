package org.example

class NumberOfProvinces {

    fun findCircleNum(isConnected: Array<IntArray>): Int {
        val n = isConnected.size
        val dsu = DSU(n)
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (isConnected[i][j] == 1) {
                    dsu.union(i, j)
                }
            }
        }
        return dsu.componentsCount
    }

}

class DSU(private val n: Int) {
    private val parent = IntArray(n)
    private val size = IntArray(n)
    var componentsCount = n

    init {
        makeSet()
    }

    private fun makeSet() {
        for (i in 0 until n) {
            parent[i] = i
            size[i] = 1
        }
    }

    private fun find(x: Int): Int { // finds parent of x
        if (parent[x] != x) {
            parent[x] = find(parent[x])
        }
        return parent[x]
    }

    fun union(x: Int, y: Int): Boolean { // unites x's set with y's set
        val (xP, yP) = find(x) to find(y)
        if (xP == yP) return false
        if (size[xP] > size[yP]) {
            size[xP] += size[yP]
            parent[yP] = xP
        } else {
            size[yP] += size[xP]
            parent[xP] = yP
        }
        componentsCount--
        return true
    }

    fun size(x: Int): Int { // total size of the component that x belongs to
        return size[find(x)]
    }
}