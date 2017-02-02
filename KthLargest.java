/* Andy Hariraj
 * CIS 303
 * Assignment 1: Chapter 2
 * 2/1/17
 */

import java.util.PriorityQueue;

public class KthLargest{
	/*  algorithm implementation*/
	public static void main(String[] args){
		int[] nums= {-1, -5, -5, -2, -3, 3, 17, 12};
		int largest= findKthLargest(nums, 7);
		System.out.println(largest);

	}
	public static int findKthLargest(int[] a, int k) {
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	/* loop through entire array */
   		for(int val : a) {
       		if(!pq.contains(val))	//check if value is already in queue
        	pq.offer(val);			//add value to queue if new value

        	if(pq.size() > k) {		//maintain size of priority queue
            	pq.poll();			//	by removing the head element
        	}
    	}
    	return pq.peek();			//gets head of queue, the kthlargest element!
	}
}
