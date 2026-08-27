class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0, m = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') c++;
            else if(ch == ')' && c > 0) c--;
            else if(ch == ')' && c <= 0) m++;
            System.out.println(c + " " + m);
        }

        return Math.abs(c + m);
    }
}