class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int ans=-1,sum=0;
        if(n==1 || n==2){
            return -1;
        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int prev=arr[0];
        for(int i=1;i<n;i++){
             if(prev==sum-arr[i]-prev){
               ans=i;
               break;
           }
           
           prev=prev+arr[i];
          
       }
            
        return ans;
    }
}
