package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth.
 * If you have a tree with depth D, you'll have D linked lists.
 *
 * It might seem like you want to do a level by level traversal, but you really don't have to, you can actually do
 * a preorder traversal and pass the lists and depth down through.
 */
public class ListOfDepths {

    public static void main(String[] args){

        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(1);
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(2);
        BinaryTreeNode binaryTreeNode3 = new BinaryTreeNode(3);
        BinaryTreeNode binaryTreeNode4 = new BinaryTreeNode(4);
        BinaryTreeNode binaryTreeNode5 = new BinaryTreeNode(5);
        BinaryTreeNode binaryTreeNode6 = new BinaryTreeNode(6);
        BinaryTreeNode binaryTreeNode8 = new BinaryTreeNode(8);
        BinaryTreeNode binaryTreeNode9 = new BinaryTreeNode(9);
        BinaryTreeNode binaryTreeNode10 = new BinaryTreeNode(10);

        binaryTreeNode2.left = binaryTreeNode1;
        binaryTreeNode5.left = binaryTreeNode4;

        binaryTreeNode3.left = binaryTreeNode2;
        binaryTreeNode3.right = binaryTreeNode5;

        binaryTreeNode9.left = binaryTreeNode8;
        binaryTreeNode9.right = binaryTreeNode10;

        binaryTreeNode6.left = binaryTreeNode3;
        binaryTreeNode6.right = binaryTreeNode9;

        Map<Integer, List<BinaryTreeNode>> listOfDepths = listOfDepths(binaryTreeNode6);
        System.out.println("It all worked perfectly of course.");
    }


    public static Map<Integer, List<BinaryTreeNode>> listOfDepths(BinaryTreeNode binaryTreeNode){
        return listOfDepths(binaryTreeNode, new HashMap<Integer, List<BinaryTreeNode>>(), 1);
    }

    public static Map<Integer, List<BinaryTreeNode>> listOfDepths(BinaryTreeNode binaryTreeNode, Map<Integer, List<BinaryTreeNode>> listOfDepths, int depth){
        if(binaryTreeNode == null){
            return listOfDepths;
        }
        if(listOfDepths.get(depth) == null){
            listOfDepths.put(depth, new ArrayList<>());
        }
        listOfDepths.get(depth).add(binaryTreeNode);
        listOfDepths(binaryTreeNode.left, listOfDepths, depth + 1);
        listOfDepths(binaryTreeNode.right, listOfDepths, depth + 1);
        return listOfDepths;
    }




}
