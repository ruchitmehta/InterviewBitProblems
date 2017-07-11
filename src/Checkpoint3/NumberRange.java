package Checkpoint3;

import java.util.ArrayList;

/**
 * Created by ruchitmehta
 * https://www.interviewbit.com/problems/numrange/
 */
public class NumberRange {

    public static void main(String args[]){
        NumberRange ob = new NumberRange();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(2);
        int result = ob.numRange(arrayList, 6, 8);
        System.out.println(result);
    }

    public int numRange(ArrayList<Integer> a, int b, int c) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if (sum >= b && sum <= c) count++;
                if(sum > c ) break;
            }
        }
        return count;
    }
}
