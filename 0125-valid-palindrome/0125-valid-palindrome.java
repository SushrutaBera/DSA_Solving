class Solution {
    public boolean isPalindrome(String s) {
        String ns = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch) || Character.isLetter(ch)) ns += Character.toLowerCase(ch);
        }
        System.out.println(s + " " + ns);
        int l = ns.length() - 1;
        for(int i = 0; i <= l; i++) {
            if(ns.charAt(i) != ns.charAt(l - i)) return false;
            else continue;
        }
        return true;
    }
}