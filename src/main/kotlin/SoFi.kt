package org.example

import kotlin.math.max
import kotlin.math.min

class SoFi {

    data class Node (
        var left: Node? = null,
        var right: Node? = null,
        val value: Int
    )

    fun insertNode(node: Node?, value: Int): Node {
        if (node == null) return Node(value = value)
        if (value <= node.value) {
            node.left = insertNode(node.left, value)
        } else {
            node.right = insertNode(node.right, value)
        }
        return node
    }

    fun isValid(node: Node): Boolean =
        isValid(node, Int.MIN_VALUE, Int.MAX_VALUE)

    private fun isValid(node: Node, min: Int, max: Int): Boolean {
        if (node.value < min || node.value > max) return false
        if (node.left == null && node.right == null) return true
        node.left?.let {
            if (!isValid(it, min, min(node.value, max))) return false
        }
        node.right?.let {
            if (!isValid(it, max(node.value, min), max)) return false
        }

        return true
    }
/*
//    4
//   / \
//  3   5   (Not a binary search tree because 6 > 4)
//   \
//.   6

node = 4
min = Int.MIN_VALUE
max = Int.MAX_VALUE
 */


}

// A binary tree is a tree where each node can have an optional left and right branch. For example:
//
//    4
//   / \
//  5   5
//
// A binary search tree is a binary tree where all the children on the left branch of a node are less than or equal to the value contained by the node. All the children on the right branch are greater than the value contained by the node. For example:
//
//    4
//   / \
//  3   5 (Is a binary search tree)

//    4
//   / \
//  6   5   (Not a binary search tree because 6 > 4)

//    4
//   / \
//  3   5   (Not a binary search tree because 6 > 4)
//   \
//.   6
//
// Question 1) Write a class (or classes) to represent a binary search tree.
// Question 2) Write a method to insert a value into the binary search tree.
// Question 3) Write a method to determine whether or not a given binary tree is a valid