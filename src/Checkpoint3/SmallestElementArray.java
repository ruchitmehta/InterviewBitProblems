package Checkpoint3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by ruchitmehta
 * https://www.interviewbit.com/problems/kth-smallest-element-in-the-array/
 */
public class SmallestElementArray {

    public static void main(String args[]){
        SmallestElementArray ob =  new SmallestElementArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = {2, 1, 4, 3, 2};
        for(int i : array) arrayList.add(i);

        System.out.println(ob.kthsmallest(arrayList, 3));
    }


    public int kthsmallest(final List<Integer> A, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : A) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
