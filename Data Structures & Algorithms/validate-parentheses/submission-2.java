class Solution {

    boolean isEmpty (int top){

        if (top==-1){
            return true;
        }
        else {
            return false;
        }

    }
    public boolean isValid(String s) {

        char [] stack = new char [s.length()];
        int top=-1;

        for (int i=0; i< s.length() ; i++){
            char c= s.charAt(i);
            if (c=='(' || c=='[' || c=='{'){
                stack[++top]=c;
            }
            else if (c==')' || c==']' || c=='}'){
                if (top!=-1 && ((c==')' && stack[top]=='(') || (c==']' && stack[top]=='[') || (c=='}'&& stack[top]=='{' ))){
                    top--;
                }
                else{
                    stack[++top]=c;
                }
            }

        }
        return isEmpty(top);
    }
}
