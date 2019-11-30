package linkedlist;

import datastructure.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Remove duplicates from an unsorted linked list.
 */
public class DeleteDuplicates {

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

        System.out.println("Removing duplicates");
        removeDuplicatesUsingTwoPointers(head);

        System.out.println("Dups Removed: " + head.toString());

    }

    /**
     * This is a simple iteration with a single pass, but it
     * requires extra space to keep track of items we have already seen.
     *
     * @param node
     */
    public static void removeDuplicatesUsingSet(LinkedListNode node){
        Set<Integer> values = new HashSet<>();
        LinkedListNode prev = null;
        while(node != null){
            if(values.contains(node.data)){
                //we don't have to worry about this being null
                //since values will never contain node.data on the first node
                //also, if I am removing node, I don't want to increment prev to node (it doesn't exist anymore)
                prev.next = node.next;
            }else{
                prev = node;
                values.add(node.data);
            }
            node = node.next;
        }

    }

    /**
     * This solution requires no extra space, but it runs in O(n^2) time.
     * It uses two pointers, one to do the main iteration, and one to go find duplicates.
     * @param node
     */
    public static void removeDuplicatesUsingTwoPointers(LinkedListNode node){
        //so I'm going to iterate through each node
        //there will be a case where my previous is null, and there
        //will be a case where my next is null
        while(node.next != null){

            //runner starts where I am currently
            LinkedListNode runner = node;

            //if there is a next item, then I need to see if it matches node.data
            while(runner.next != null){

                //if there is a match, then I change runner's pointer to point to the
                //later skipped item
                if(runner.next.data == node.data){
                    runner.next = runner.next.next;
                }else{
                    //only increment runner if there wasn't a match
                    //if you increment it when there isn't a match, you risk
                    //skipping checking an item
                    runner = runner.next;
                }
            }


            node = node.next;
        }
    }
}
