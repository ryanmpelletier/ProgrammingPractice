package tree;


/**
 * Given a sorted array in increasing order, construct an algorithm to build a binary
 * search tree from the given data with minimal height.
 */
public class MinimalTree {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        BinaryTreeNode binaryTreeNode = buildMinimalBST(arr);
        System.out.println("Done and it worked perfectly.");

    }

    public static BinaryTreeNode buildMinimalBST(int[] arr){
        return buildMinimalBSTRecur(arr, 0, arr.length);
    }

    public static BinaryTreeNode buildMinimalBSTRecur(int[] arr, int l, int r){
        //if our left has passed our right, there are no more nodes to add
        if(l >= r){
           return null;
        }

        int m = l + (r - l) / 2;

        BinaryTreeNode node = new BinaryTreeNode(arr[m]);
        node.left = buildMinimalBSTRecur(arr, l, m);
        node.right = buildMinimalBSTRecur(arr, m + 1, r);
        return node;
    }




}
