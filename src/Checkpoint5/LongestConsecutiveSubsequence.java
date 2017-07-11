package Checkpoint5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ruchitmehta
 * https://www.interviewbit.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSubsequence {
    public static void main(String args[]){
        LongestConsecutiveSubsequence obj = new LongestConsecutiveSubsequence();
        List<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(4);
        a.add(5);
        a.add(3);
        a.add(12);

        System.out.println(obj.longestConsecutive(a));
    }

    public int longestConsecutive(final List<Integer> a) {

        int[] num = new int[a.size()];
        for(int i = 0; i < a.size(); i++){
            num[i] = a.get(i).intValue();
        }

        if (num.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<Integer>();
        int max = 1;

        for (int e : num)
            set.add(e);

        for (int e : num) {
            int left = e - 1;
            int right = e + 1;
            int count = 1;

            while (set.contains(left)) {
                count++;
                set.remove(left);
                left--;
            }

            while (set.contains(right)) {
                count++;
                set.remove(right);
                right++;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
