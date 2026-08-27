class Solution {
    public int minAddToMakeValid(String s) {
        int c = 0, m = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') c++; // no of open bracket
            else if(ch == ')' && c > 0) c--; // no of open brackers that met an end bracket
            else if(ch == ')' && c <= 0) m++; // no of closed brakcet which had no open bracket
            System.out.println(c + " " + m);
        }

        return Math.abs(c + m); // total
    }
}