class Solution {
    public int calPoints(String[] operations) {

        int n=0;
        int [] stack = new int [operations.length];

        for (int i=0 ; i<operations.length;i++ ){
            if (operations[i].charAt(0)=='+'){

                stack[n]=stack[n-1]+stack[n-2];
                n++;
                continue;

            }
            if (operations[i].charAt(0)=='C'){
                n--;
                continue;
            }
            if (operations[i].charAt(0)=='D'){

                stack[n]=stack[n-1]*2;
                n++;

            }
            else{
                stack[n]=0;
                for (int j=0 ; j<operations[i].length();j++){
                    if (operations[i].charAt(j)=='-'){
                        continue;
                    }
                    stack[n]=stack[n]*10 + (operations[i].charAt(j))-48;
                }
                if (operations[i].charAt(0)=='-'){
                    stack[n]*= -1;
                }

                n++;
        }
        }       
        int result=0;
        for (int i=0 ; i < n ; i++){
            result+=stack[i];
        }

        return result;
    }
}