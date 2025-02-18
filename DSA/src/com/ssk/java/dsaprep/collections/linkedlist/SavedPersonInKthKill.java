package com.ssk.java.dsaprep.collections.linkedlist;


/*
	There are N people standing in a circle numbered from 0 to N-1 waiting to be executed. The counting out begins at some point in the circle and proceeds around the circle in a fixed direction. In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), until only the last person remains, who is given freedom. Given the total number of person N and a number K which indicates that K-1 persons are skipped and Kth person is killed in the circle, after killing the K-th person, the executed person is removed and the next iteration begins from the next position. The task is to find the position of the last person who manages to survive.
	Examples:
	Input: N = 5 and K = 2
	Output: Safe position is 2.
	Firstly, the person at position 1 is killed,
    then the person in position 3 is killed,
    then the person at position 0 is killed.

    Finally, the person in position 4 is killed.
    So the person at position 2 survives.

	Input: N = 7 and K = 3
    Output: Safe position is 3.
    The persons at positions 2, 5, 1, 6, 4, 0 are killed in order, and the person at position 3 survives.
*/

// Using collections - LinkedList !

import java.util.Iterator;
import java.util.LinkedList;

public class SavedPersonInKthKill {

    public static void main(String[] args) {
        int n=4,k=1;
        SavedPersonInKthKill sp = new SavedPersonInKthKill();
        System.out.println("Safe position - "+sp.getSafePosition(n,k));
    }

    public int getSafePosition(int n,int k){
        // let set input ( for 0-n )
        // iterater input while input.size() > 1 :
            // for each possition increment count
                // iterate for count < k
                    // yes : count ++
                    // no : remove.
                    // if reached last element ? ( linkedlist - circular >> iterator() .
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }

        // start iterator
        Iterator<Integer> it = list.iterator();

        while(list.size()>1){
            int count=1;
            while(count<k){
                while(it.hasNext() && count<=k){
                    it.next();
                    count++;
                }
                if(count<k){
                    it= list.iterator(); // cirular linked list keeps counting from start position.
                    it.next();
                    count++;
                }
                it.remove();
            }
        }
        return list.getFirst();
    }

    // NOTE - Above solution is not giving valid outputs for some cases.

}
