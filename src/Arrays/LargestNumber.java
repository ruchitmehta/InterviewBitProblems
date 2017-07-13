package Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

/**
 * Created by ruchitmehta
 * https://www.interviewbit.com/problems/largest-number/
 */
public class LargestNumber {

    public static void main(String args[]){
        LargestNumber num = new LargestNumber();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(34);
        list.add(5);
        list.add(9);

        System.out.println(num.largestNumber(list));
    }


    public String largestNumber(final List<Integer> a) {


        String[] arr = new String[a.size()];
        for(int i=0; i<a.size(); i++){
            arr[i]=String.valueOf(a.get(i));
        }

        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }

        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        return sb.toString();
    }
}
