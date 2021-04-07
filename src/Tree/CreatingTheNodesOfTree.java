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
    }

    public  void inOrderTraversal(TreeNode root){

    }
}

