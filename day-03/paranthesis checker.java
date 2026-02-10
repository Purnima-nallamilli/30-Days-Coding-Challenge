//stack problem
class Solution {
    public boolean isBalanced(String s) {
        int n=s.length();
        Stack <Character> st = new Stack <> ();
        if(s.charAt(0)=='}' || s.charAt(0)==')' || s.charAt(0)==']'){
            return false;
        }
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
               st.push(s.charAt(i));
           }
           else if(s.charAt(i)==')' && !st.isEmpty()){
               
               if(st.peek()=='('){
                   st.pop();
               }
               else{
                   st.push(s.charAt(i));
               }
               
           }
             else if(s.charAt(i)==']' && !st.isEmpty()){
               
               if(st.peek()=='['){
                   st.pop();
               }
               else{
                   st.push(s.charAt(i));
               }
               
           }
             else if(s.charAt(i)=='}' && !st.isEmpty()){
               
               if(st.peek()=='{'){
                   st.pop();
               }
               else{
                   st.push(s.charAt(i));
               }
               
           }
           else{
            st.push(s.charAt(i));
           }
        }
        
       if(st.isEmpty()){
           return true;
       } 
       return false;
    }
}
