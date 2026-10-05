//Question:-136
import java.util.HashSet;
public class SingleNo {

    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
            else {
                set.add(nums[i]);
            }
        }
        for (int ans : set) {
            return ans;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + singleNumber(arr)); // Output: 4
    }
}