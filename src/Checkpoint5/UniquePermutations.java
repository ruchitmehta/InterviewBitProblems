package Checkpoint5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ruchitmehta
 */
public class UniquePermutations {
    public static void main(String args[]){
        UniquePermutations obj = new UniquePermutations();
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(1);
        num.add(2);
        System.out.println(obj.permute(num).toString());
    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> list) {
        int[] num = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            num[i] = list.get(i).intValue();
        }

        ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
        returnList.add(new ArrayList<Integer>());

        for (int i = 0; i < num.length; i++) {
            Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
            for (List<Integer> l : returnList) {
                for (int j = 0; j < l.size() + 1; j++) {
                    l.add(j, num[i]);
                    ArrayList<Integer> T = new ArrayList<Integer>(l);
                    l.remove(j);
                    currentSet.add(T);
                }
            }
            returnList = new ArrayList<ArrayList<Integer>>(currentSet);
        }

        return returnList;
    }
}
