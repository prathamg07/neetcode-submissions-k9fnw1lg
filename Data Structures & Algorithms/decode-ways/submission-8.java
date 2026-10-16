class Solution {
    public int numDecodings(String s) {
        int prev = 1;
        int curr = s.charAt(s.length() - 1) == '0' ? 0 : 1;

        for (int i = s.length() - 2; i >= 0; i--) {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';
            int pair = a * 10 + b;

            int nextCount = 0;

            if (a != 0) {
                nextCount = curr;

                if (pair >= 10 && pair <= 26) {
                    nextCount += prev;
                }
            }

            prev = curr;
            curr = nextCount;
        }

        return curr;
    }
}