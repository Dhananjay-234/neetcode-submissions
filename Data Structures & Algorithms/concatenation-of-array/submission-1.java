class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=n*2;
        int a=0;
        int i=0;
        int[] ans=new int[m];
        while(a<m){
            ans[a]=nums[i];
            a++;
            i++;
            if(i==n ){
                i=0;
            }
        }
        return ans;
    }
}