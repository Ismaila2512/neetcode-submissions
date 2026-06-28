class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        int spoint = 0,tpoint = 0;

        //if(sc.length == 1 && tc.length == 1 && sc[0] == tc[0])return true;

        if(sc.length != tc.length)return false;

        for(int i=0;i<sc.length;i++){
            if(sc[i] != tc[i]){
                return false;
            }
        }
        return true;

    }
}
