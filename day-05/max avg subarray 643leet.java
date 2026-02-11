class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l=0,temp=0;
        double ans=Integer.MIN_VALUE,ans1=0;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            if(r-l==k){
                temp-=nums[l];
                l++;

            }
            if(r-l+1==k){
                ans1=(double)temp/k;
                ans=Math.max(ans,ans1);
            }

        }
        return ans;
        
    }
}
