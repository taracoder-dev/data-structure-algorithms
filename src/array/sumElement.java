package array;

public class sumElement {

    public static void main(String[] args) {
        int[]  nums = {65,43,53,53,23,56};
        System.out.println(sumOfElement(nums));
    }

    private static int sumOfElement(int[] nums) {
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

        }
        return sum;
    }
}
