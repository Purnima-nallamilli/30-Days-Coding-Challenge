class Solution {
    public int binarysearch(int[] arr, int k) {
       int l=0;
       int r=arr.length-1;
       while(l<=r){
            int mid =l+(r-l)/2;
          
            if(arr[mid]>=k){
               r=mid-1;
           }
           else{
             l=mid+1;
           }
       }
       if(l==arr.length){
           return -1;
       }
       if(arr[l]!=k){
           return -1;
       }
      
       return l;
    }
}
