package learn;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solutions {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        //List<Integer> correctKey = new
        backTrack(result, temp);
        for (var i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Totals: " + result.size());
    }

    static void backTrack(List<List<Integer>> result, List<Integer> tempList){
        if (tempList.size() == 4){
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (tempList.contains(i)) continue;
            tempList.add(i);
            backTrack(result, tempList);
            tempList.removeLast();
        }
    }
}