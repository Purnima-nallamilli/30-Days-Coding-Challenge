class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        ArrayList <Integer> ar = new ArrayList <> ();
        // code here
        int n=arr.length,ans=0;
        HashMap <Integer,Integer> hs =new HashMap <> ();
        for(int i=0;i<n;i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],1);
            }
            else{
                hs.put(arr[i],hs.get(arr[i])+1);
            }
        }
        for(int i=1;i<=n;i++){
            if(hs.get(i)==null){
                ans=0;
            }
            else{
                ans=hs.get(i);
            }
            ar.add(ans);
        }
        return ar;
    }
}
