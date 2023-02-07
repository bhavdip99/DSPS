package com.bhavdip.interview

/*
Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.
Given the root to such a tree, write a function to evaluate it.
For example, given the following tree:
   *
  / \
 +    +
/ \  / \
3  2  4  5
You should return 45, as it is (3 + 2) * (4 + 5).
*/
// [*,+,+,3,2,4,5]

//
//// This code is contributed by Rajput-Ji
fun main(args: Array<String>) {
    val root = TreeNode("*")
    root.left = TreeNode("+")
    root.right = TreeNode("+")
    root.left?.right = TreeNode("3")
    root.left?.left = TreeNode("3")
    root.right?.right = TreeNode("4")
    root.right?.left = TreeNode("3")
    print(arithmaticBinaryTree(root))
}

data class TreeNode(val value1: String) {
    val value: String = value1
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun arithmaticBinaryTree(treeNode: TreeNode): Int {
    var treeNode = treeNode
    if (treeNode == null) return 1
    while (treeNode.left != null || treeNode.right != null) {
        println(treeNode.left)
        treeNode = treeNode.left!!
        // TODO("Yet to implement ")

    }

    return 0
}