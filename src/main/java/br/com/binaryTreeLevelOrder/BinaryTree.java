package br.com.binaryTreeLevelOrder;

/**
 * https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
 *
 * Tree: Level Order Traversal
 *
 * Given a pointer to the root of a binary tree, you need to print the level order traversal of this tree. In level-order traversal, nodes are visited level by level from left to right. Complete the function levelOrder and print the values in a single line separated by a space.
 *
 * For example:
 *
 *      1
 *       \
 *        2
 *         \
 *          5
 *         /  \
 *        3    6
 *         \
 *          4
 * For the above tree, the level order traversal is 1 2 5 3 6 4.
 *
 * Input Format
 *
 * You are given a function,
 *
 * void levelOrder(Node * root) {
 *
 * }
 * Constraints
 *
 * image
 *
 *  Nodes in the tree
 *
 * Output Format
 *
 * Print the values in a single line separated by a space.
 *
 * Sample Input
 *
 *      1
 *       \
 *        2
 *         \
 *          5
 *         /  \
 *        3    6
 *         \
 *          4
 * Sample Output
 *
 * 1 2 5 3 6 4
 *
 * Explanation
 *
 * We need to print the nodes level by level. We process each level from left to right.
 * Level Order Traversal: 1 2 5 3 6 4.
 */
public interface BinaryTree {

    static void levelOrder(Node root) {
        int height = getHeight(root) + 1;
        for (int i = 1; i <= height; i++) {
            givenLevel(root, i);
        }
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }
        int left = getHeight(root.getLeft());
        int right = getHeight(root.getRight());
        return Math.max(left, right) + 1;
    }

    private static void givenLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.getData() + " ");
        } else if (level > 1) {
            givenLevel(root.getLeft(), level - 1);
            givenLevel(root.getRight(), level - 1);
        }
    }

}
