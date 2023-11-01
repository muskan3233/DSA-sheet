package Random_easy;

public class twoSum {
    static int[] tSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){
        int nums[] = {23,45,56,67,78,89,90};
        System.out.println(tSum(nums, 179));
    }
}
