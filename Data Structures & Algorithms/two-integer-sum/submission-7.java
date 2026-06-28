class Solution {
    public int[] twoSum(int[] nums, int target) {
        // //int left = 0;

        // for(int left =0;left< nums.length ;left++){
        // int comp = target - nums[left];
        // int right = left + 1;
        // while(right < nums.length){
        //     if(nums[right] + nums[left] == target){
        //         return new int[] {left,right};
        //     }
        //     right++;
        // }
        // }
        // return new int[] {};     

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];

            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            }

            map.put(nums[i],i);
        }


    return new int[] {};
    }
}
