//Question-217

import java.util.HashSet;

public class ContainsDupli {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        System.out.println("Result 1: " + containsDuplicate(arr1)); // Output: true

        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Result 2: " + containsDuplicate(arr2)); // Output: false
    }
}