package com.ssk.java.dsaprep.sorting.practice;

/*
    Merge K Sorted Linked Lists
		Given k linked lists where each one is sorted in the ascending order, merge all of them into a single sorted linked list.
		Example
			{
			"lists": [
			[1, 3, 5],
			[3, 4],
			[7]
			]
			}
			Output:
			[1, 3, 3, 4, 5, 7]

		Constraints:
			0 <= k <= 104
			0 <= length of any given linked list <= 103
			-109 <= node values <= 109
			Sum of the lengths of all given lists won't exceed 105.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeKSortedLinkedList {
    public static void main(String[] args) {

        // preloaded input of type - ArrayList<LinkedListNode> : START
        LinkedListNode ll1_3=new LinkedListNode(5);
        LinkedListNode ll1_2=new LinkedListNode(3);
        LinkedListNode ll1_1=new LinkedListNode(1);
        ll1_1.next=ll1_2;
        ll1_2.next=ll1_3;

        LinkedListNode ll2_2=new LinkedListNode(4);
        LinkedListNode ll2_1=new LinkedListNode(3);
        ll2_1.next=ll2_2;

        LinkedListNode ll3_1=new LinkedListNode(7);

        ArrayList<LinkedListNode> inputList=new ArrayList<>();
        inputList.add(ll1_1);
        inputList.add(ll2_1);
        inputList.add(ll3_1);
        // preloaded input of type - ArrayList<LinkedListNode> : END

        //print output.
        LinkedListNode output=merge_k_sortedLL(inputList);
        System.out.print(output.value);
        while(output.next!=null){
            output=output.next;
            System.out.print(","+output.value);
        }
    }

    public static LinkedListNode merge_k_sortedLL(ArrayList<LinkedListNode> inputList){
        // Cover Base cases
        if(inputList.size()==0 || inputList.isEmpty()) return null;
        if(inputList.size()==1) return inputList.get(0);
        // for remaining cases
//        if(inputList.size()>1){
        // Remove first two lists from input and Merge and add it back to input at index 0. ( Progressive merge )
        while(inputList.size()!=1){
            LinkedListNode startPtr=inputList.get(0);
            LinkedListNode endPtr=inputList.get(1);
            inputList.remove(0);
            inputList.remove(0);
            inputList.add(mergedLinkedList(startPtr,endPtr));
        }
//        }

        // return final merged linkedlist
        return inputList.get(0);
    }

    public static LinkedListNode mergedLinkedList(LinkedListNode left,LinkedListNode right){
        LinkedListNode dummyHead=new LinkedListNode(0);
        LinkedListNode result=dummyHead;
        while(left!=null&&right!=null){
            if(left.value<=right.value){
                result.next=left;
                left=left.next;
            }
            else{
                result.next=right;
                right=right.next;
            }
            result=result.next;
        }
        if(left!=null) result.next = left;;
        if(right!=null) result.next = right;
        return dummyHead.next;
    }
}

class LinkedListNode {
    Integer value;
    LinkedListNode next;

    LinkedListNode(Integer value) {
        this.value = value;
        this.next = null;
    }
}