class Solution {
    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                StringBuilder str = new StringBuilder();

                while (!stack.peek().equals("[")) {
                    str.insert(0, stack.pop());
                }

                stack.pop();
                StringBuilder num = new StringBuilder();

                while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))) {
                    num.insert(0, stack.pop());
                }
                int k = Integer.parseInt(num.toString());
                StringBuilder repeated = new StringBuilder();

                while (k > 0) {
                    repeated.append(str);
                    k--;
                }

                stack.push(repeated.toString());

            } 
            else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }

        StringBuilder ans = new StringBuilder();

        for (String x : stack) {
            ans.append(x);
        }

        return ans.toString();
    }
}