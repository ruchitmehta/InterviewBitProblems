package Arrays;

import java.util.ArrayList;

/**
 * Created by ruchitmehta
 * https://www.interviewbit.com/problems/add-one-to-number/
 */
public class AddOneToNumber {
    public static void main(String args[]){
        AddOneToNumber add = new AddOneToNumber();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);

        System.out.println(add.plusOne(list).toString());
    }


    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        int size;
        int carry = 1;
        int num;

        size = A.size();

        for (int i = size - 1; i >= 0; i--) {

            num = A.get(i);
            num += carry;
            carry = 0;

            if (num == 10) {
                num = 0;
                carry = 1;
            }

            A.set(i, num);

        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        if (carry == 1)
            res.add(1);

        for (int x : A) {
            if (x == 0 && res.size() == 0)
                continue;
            res.add(x);
        }

        return res;

    }


}
