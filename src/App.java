import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        twoSum(new int[]{2, 7, 13, 15}, 9);
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 13, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        //Time:O(n)
        //Space:O(n)

        //key: number, value: index
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)) return new int[]{map.get(diff), i};

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
