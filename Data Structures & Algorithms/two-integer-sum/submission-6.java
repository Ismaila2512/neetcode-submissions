class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int left = 0;

        for(int left =0;left< nums.length ;left++){
        int comp = target - nums[left];
        int right = left + 1;
        while(right < nums.length){
            if(nums[right] + nums[left] == target){
                return new int[] {left,right};
            }
            right++;
        }
        }
        return new int[] {};     
    }
}
