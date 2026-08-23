class Solution {
    public int balancedStringSplit(String s) {
        int b, n;
        b = n = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'R') b--;
            if(ch == 'L') b++;
            if(b == 0)n++;
        }

        return n;
    }
}