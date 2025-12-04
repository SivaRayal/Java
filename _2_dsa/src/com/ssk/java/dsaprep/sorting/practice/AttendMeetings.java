package com.ssk.java.dsaprep.sorting.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
    Attend Meetings
		Given a list of meeting intervals where each interval consists of a start and an end time, check if a person can attend all the given meetings such that only one meeting can be attended at a time.
		Example One
			{
			"intervals": [
			[1, 5],
			[5, 8],
			[10, 15]
			]
			}
			Output:
			1
			As the above intervals are non-overlapping intervals, it means a person can attend all these meetings.

		Example Two
			{
			"intervals": [
			[1, 5],
			[4, 8]
			]
			}
			Output:
			0
			Time 4 - 5 is overlapping in the first and second intervals.

		Notes
			A new meeting can start at the same time the previous one ended.

		Constraints:
			1 <= number of intervals <= 105
			0 <= start time < end time <= 109

*/

public class AttendMeetings {

    public static void main(String[] args) {

        // Preloaded input
        ArrayList<Integer> inp1=new ArrayList<>(Arrays.asList(1, 5));
        ArrayList<Integer> inp2=new ArrayList<>(Arrays.asList(5, 8));
        ArrayList<Integer> inp3=new ArrayList<>(Arrays.asList(10, 15));
        ArrayList<ArrayList<Integer>> intervals=new ArrayList<>();
        intervals.add(inp1);
        intervals.add(inp2);
        intervals.add(inp3);

        // Print Output
        System.out.println(can_attend_all_meetings(intervals));
    }

    // Handler methor accepting datatype - ArrayList<ArrayList<Integer>>
    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        // Sortbased on the start time - QuickSort lamotos
        qsort(intervals,0,intervals.size()-1);

        //Compare based on end time with next start time
        for(int i=0;i<intervals.size()-1;i++){
            if(intervals.get(i).get(1)>intervals.get(i+1).get(0)) return 0;
        }

        return 1;
    }

    static void qsort(ArrayList<ArrayList<Integer>> intervals, int start, int end){
        if(start > end)
            return;

        int pivot = new Random().nextInt((end-start)+1) + start;
        Collections.swap(intervals, start, pivot);

        int smaller = start;
        for(int bigger = start+1; bigger <= end; bigger++){
            if(intervals.get(bigger).get(0) < intervals.get(start).get(0)){
                smaller++;
                Collections.swap(intervals, bigger, smaller);
            }
        }
        Collections.swap(intervals, start, smaller);

        qsort(intervals, start, smaller-1);
        qsort(intervals, smaller + 1, end);
    }

    /*

    // QuickSort - Hoars - In effecient with test suite
    static void qsort(ArrayList<ArrayList<Integer>> intervals,Integer left,Integer right){
        if(left<right){
            Integer pivote = hoaresPartition(intervals,left,right);
            qsort(intervals,left,pivote);
            qsort(intervals,pivote+1,right);
        }
    }

    static Integer hoaresPartition(ArrayList<ArrayList<Integer>> intervals,Integer left,Integer right){
        Integer pivote=intervals.get(left).get(0);
        int i=left-1;
        int j=right+1; // preinitilize
        while(true){
            // smallest element index
            do{
                i++;
            }while(intervals.get(i).get(0)<pivote);

            // lagest element index
            do{
                j--;
            }while(intervals.get(j).get(0)>pivote);

            // index crossover
            if(i>=j) return j;

            Collections.swap(intervals,i,j);
        }
    }

    */
}


