class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        int set = 1;

        for(int i = 1;i <= n;i++){
            if(set * 2 == i){
                set = i;
            }

            res[i] = 1 + res[i - set];
        }
        return res;
    }
}
