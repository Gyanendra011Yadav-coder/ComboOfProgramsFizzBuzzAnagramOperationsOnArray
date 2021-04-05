/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 4/5/2021
 *   Time: 2:29 PM
 *   File: CreatingBinaryTree.java
 */

package Tree;


public class CreatingNodesOfTree {
    /*
TIGHTLY ENCAPSULATED NODE CREATION OF THE TREE.
 */


//    class TreeNode {
//        private int key;
//        private TreeNode leftChild, rightChild;
//
//        public Integer getKey() {
//            return key;
//        }
//
//        public TreeNode getLeftChild() {
//            return leftChild;
//        }
//
//        public void setLeftChild(TreeNode leftChild) {
//            this.leftChild = leftChild;
//        }
//
//        public TreeNode getRightChild() {
//            return rightChild;
//        }
//
//        public void setRightChild(TreeNode rightChild) {
//            this.rightChild = rightChild;
//        }
//    }
    class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            key = data;
            left = right = null;
        }
    }

}

