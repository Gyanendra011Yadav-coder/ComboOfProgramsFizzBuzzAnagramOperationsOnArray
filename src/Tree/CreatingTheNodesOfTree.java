/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 4/5/2021
 *   Time: 4:39 PM
 *   File: CreatingTheNodesOfTree.java
 */

package Tree;

public class CreatingTheNodesOfTree {
    static class TreeNode {
        int key;
        TreeNode leftChild, rightChild;

        public TreeNode(int key) {
            this.key = key;
            leftChild = rightChild = null;

        }
    }


    public static class BinaryTree {
        TreeNode root;

        public BinaryTree(int key) {
            root = new TreeNode(key);
        }

        BinaryTree() {
            root = null;
        }


        public static void main(String[] args) {

            BinaryTree tree = new BinaryTree();
            tree.root = new TreeNode(50);
            tree.root.leftChild = new TreeNode(20);
            tree.root.rightChild = new TreeNode(60);
            tree.root.leftChild.leftChild = new TreeNode(10);
            tree.root.leftChild.rightChild = new TreeNode(25);
            tree.root.rightChild.leftChild = new TreeNode(40);
            tree.root.rightChild.rightChild = new TreeNode(70);
            System.out.println();
        }


    }
}

