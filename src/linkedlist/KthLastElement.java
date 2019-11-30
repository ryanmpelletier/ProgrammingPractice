package linkedlist;

import datastructure.LinkedListNode;

/**
 * Find the kth last element of a singly linked list.
 *
 * This is trivial if you know the length of the list...but we probably don't.
 * You could find out the length of the list then go through again, but that seems inefficient.
 *
 * There is an iterative approach where you put two pointers k items apart, then iterate both until the end.
 *
 * Let's think about recursion. I think we can use recursion to easily tell if an item is the kth item in a list.
 * The recursive call would be to figure out which item a particular node was away from the end of the list.
 *
 *
 * Base case is that it is the last item, return 0, else return 1 + recurr.
 * Then after the recursive call you can check that number, if it is the kth number, you print it out.
 *
 */
public class KthLastElement {

    public static void main(String[] args){

        LinkedListNode head = new LinkedListNode(1);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(-9);
        head.appendToTail(2);
        head.appendToTail(7);
        head.appendToTail(-1);
        head.appendToTail(-19);
        head.appendToTail(2);
        head.appendToTail(-9);
        head.appendToTail(2);

        System.out.println("Original: " + head.toString());
        findKthLastElementRecursive(head, 3);
        System.out.println("Kth: " + findKthLastElementIterative(head, 3).data);

    }


    /**
     * This solution works by counting nodes recursively, if I am on the kth
     * from last node, I simply print out the value stored there.
     *
     * @param linkedListNode
     * @param k
     * @return
     */
    public static int findKthLastElementRecursive(LinkedListNode linkedListNode, int k){
        int numberFromEnd = linkedListNode.next == null ? 0 : 1 + findKthLastElementRecursive(linkedListNode.next, k);
        if(numberFromEnd == k){
            System.out.println("Kth: " + linkedListNode.data);
        }
        return numberFromEnd;
    }


    /**
     * Here is an iterative approach that initializes two pointers
     * k items apart. Then it iterates until one of the pointers hits the end and returns that value.
     */
    public static LinkedListNode findKthLastElementIterative(LinkedListNode node, int k){
        LinkedListNode first = node;
        LinkedListNode firstPlusK = node;
        for(int i = 0; i < k; i++){
            if(firstPlusK.next == null){
                System.out.println("no kth last element");
                return null;
            }
            firstPlusK = firstPlusK.next;
        }

        while(firstPlusK.next != null){
            first = first.next;
            firstPlusK = firstPlusK.next;
        }

        return first;
    }


}
