class Solution {
    public static int getFirstSetBit(int n) {
        String b="";
        while(n>0){
            b=(n%2)+b;
            n=n/2;
        }
        char arr[]=b.toCharArray();
        int n1=arr.length;
        for(int i=n1-1;i>=0;i--){
            if(arr[i]=='1'){
                return n1-i;
                
            }
        }
        return 0;
        
        
    }
}
