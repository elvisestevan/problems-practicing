import org.example.SoFi
import org.example.SoFi.Node
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SoFiTest {

    val soFi = SoFi()

    @Test
    fun insertNode() {
        val rootNode = Node(
            value = 4,
            left = Node(value = 3),
            right = Node(value = 5)
        )

        soFi.insertNode(rootNode, 2)

        assertEquals(Node(
            value = 4,
            left = Node(value = 3, left = Node(value = 2)),
            right = Node(value = 5)
        ), rootNode)
        assertEquals(Node(value = 3), soFi.insertNode(null, 3))

    }

    @Test
    fun isValid() {
        assertTrue(
            soFi.isValid(Node(
                value = 4,
                left = Node(value = 3),
                right = Node(value = 5)
            ))
        )
        assertFalse(
            soFi.isValid(Node(
                value = 4,
                left = Node(value = 6),
                right = Node(value = 5)
            ))
        )
        assertFalse(
            soFi.isValid(Node(
                value = 4,
                left = Node(value = 3, right = Node(value = 6)),
                right = Node(value = 5)
            ))
        )
        assertFalse(
            soFi.isValid(Node(
                value = 4,
                left = Node(value = 3, left = Node(value = 2, left = Node(value = 1, left = Node(value = 1, left = Node(value = 2))))),
                right = Node(value = 5)
            ))
        )
        assertTrue(
            soFi.isValid(Node(
                value = 4,
                left = Node(value = 3, left = Node(value = 2, left = Node(value = 1, left = Node(value = 1, left = Node(value = 1))))),
                right = Node(value = 5)
            ))
        )
    }
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