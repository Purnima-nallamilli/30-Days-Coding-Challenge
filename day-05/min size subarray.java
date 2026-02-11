class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int n=nums.length,l=0,ans=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum=sum+nums[r];
            while(sum>=target){
                ans=Math.min(ans,r-l+1);
                sum=sum-nums[l];
                l++;
            }
            if(r-l+1==n && sum<target){
                return 0;
            }
        }
            return ans;
        
    }
}
