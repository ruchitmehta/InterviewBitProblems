package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruchitmehta
 */
public class MaxDistance {

    public static void main(String args[]){
        MaxDistance dist = new MaxDistance();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);
        System.out.println(dist.maximumGap(list));
    }

    public int maximumGap(final List<Integer> A) {
        int n = A.size();
        int minLeft[] = new int[n];
        int maxRight[] = new int[n];

        minLeft[0] = A.get(0);
        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], A.get(i));
        }

        maxRight[n - 1] = A.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], A.get(i));
        }

        int i = 0, j = n - 1;
        int max = -1;

        for (j = n - 1; j >= 0; j--) {
            int num = maxRight[j];
            i = minIndex(minLeft, num);
            max = Math.max(j - i, max);
        }


        return max;
    }


    public int minIndex(int [] minLeft, int num) {

        int lo, hi, mid;
        int index = -1;

        lo = 0;
        hi = minLeft.length;

        while (lo <= hi) {
            mid = lo + ((hi - lo) >> 1);

            int minNum = minLeft[mid];

            if (num < minNum) {
                lo = mid + 1;
            } else {
                index = mid;
                hi = mid - 1;
            }
        }

        return index;

    }
}
