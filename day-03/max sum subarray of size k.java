//sliding window approch
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int sum=0,ans=0;
        int l=0;
        for(int r=0;r<n;r++){
            sum+=arr[r];
            if(r-l==k){
                sum-=arr[l];
                l++;
            }
            if(r-l+1==k){
                ans=Math.max(ans,sum);
            }
            
        }
        return ans;
        
        
    }
}
