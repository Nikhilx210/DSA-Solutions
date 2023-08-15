import java.util.*;

public class dpq6 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>[] arrayOfListOfList = new ArrayList[target + 1];
        for (int i = 0; i < target + 1; i++) {
            arrayOfListOfList[i] = new ArrayList<>();
        }

        for (int j = 0; j < candidates.length; j++) {
            for (int i = 0; i < target + 1; i++) {
                if ((i - candidates[j]) == 0) {
                    List<Integer> list1 = new ArrayList<>();
                    list1.add(i);
                    // List<Integer> list1 = new ArrayList<>();
                    arrayOfListOfList[i].add(new ArrayList<>(list1));
                } else if (i - candidates[j] > 0 && (!arrayOfListOfList[i - candidates[j]].isEmpty())) {
                    for (List<Integer> list : arrayOfListOfList[i - candidates[j]]) {
                        List<Integer> newCombination = new ArrayList<>(list);
                        newCombination.add(candidates[j]);
                        arrayOfListOfList[i].add(newCombination);
                    }
                }
            }
        }
        return arrayOfListOfList[target];
    }
}
