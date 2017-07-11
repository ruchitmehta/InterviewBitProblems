package Checkpoint4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by ruchitmehta
 * https://www.interviewbit.com/problems/nextgreater/
 */
public class NextGreater {
    public static void main(String args[]){
        NextGreater ob = new NextGreater();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] array = {3, 2, 1};
        for(int i : array) arrayList.add(i);

        System.out.println(ob.nextGreater(arrayList).toString());

    }

    public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        int[] res = new int[a.size()];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.size(); i++) {
            int height = a.get(i);
            while (!stack.isEmpty() && height > a.get(stack.peek())) {
                res[stack.pop()] = height;
            }
            stack.push(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : res) {
            result.add(num);
        }
        return result;
    }
}
