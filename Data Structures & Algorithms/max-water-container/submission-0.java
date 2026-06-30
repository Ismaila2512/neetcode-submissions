class Solution {
    public int maxArea(int[] heights) {
        int maxarea = 0,left = 0, right = heights.length - 1;

        while(left < right){
            int currh = Math.min(heights[left],heights[right]);
            int currw = right - left;
            
            maxarea = Math.max(maxarea, currh * currw);

            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}
