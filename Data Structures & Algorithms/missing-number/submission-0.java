class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1)/2,sum1=0;

        for(int num : nums){
            sum1 += num;

        }

        return sum - sum1;
    }
}
