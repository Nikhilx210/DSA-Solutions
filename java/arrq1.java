import java.util.*;

public class arrq1 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = { -1, -1 };
        int len = nums.length;
        int[] dub = new int[len];
        for (int i = 0; i < len; i++) {
            dub[i] = nums[i];
        }
        Arrays.sort(dub);
        int a = 0;
        int b = len - 1;
        while (a < b) {
            if (dub[a] + dub[b] == target) {
                break;
            } else if (dub[a] + dub[b] < target) {
                a++;
            } else {
                b--;
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] == dub[a] && arr[0] == -1) {
                arr[0] = i;
            } else if (nums[i] == dub[b] && arr[1] == -1) {
                arr[1] = i;
            }
        }
        return arr;
    }
}
