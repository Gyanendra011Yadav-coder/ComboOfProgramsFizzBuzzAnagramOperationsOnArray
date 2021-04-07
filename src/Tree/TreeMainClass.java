/*   Created by IntelliJ IDEA.
 *   Author: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *   Date: 4/7/2021
 *   Time: 3:19 PM
 *   File: TreeMainClass.java
 */

package Tree;

public class TreeMainClass {
    public static void main(String[] args) {

        CreatingTheNodesOfTree.BinaryTree tree = new CreatingTheNodesOfTree.BinaryTree();
        tree.root = new CreatingTheNodesOfTree.TreeNode(50);
        tree.root.leftChild = new CreatingTheNodesOfTree.TreeNode(20);
        tree.root.rightChild = new CreatingTheNodesOfTree.TreeNode(60);
        tree.root.leftChild.leftChild = new CreatingTheNodesOfTree.TreeNode(10);
        tree.root.leftChild.rightChild = new CreatingTheNodesOfTree.TreeNode(25);
        tree.root.rightChild.leftChild = new CreatingTheNodesOfTree.TreeNode(40);
        tree.root.rightChild.rightChild = new CreatingTheNodesOfTree.TreeNode(70);
        System.out.println();
    }
}

