class Solution {
    public int lengthOfLastWord(String s) {
       s = s.trim();
        s = s + " ";
        String last = "";
        int j = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ' ) {
                last = s.substring(j, i);
                j = i + 1;
            }
        }
        System.out.println(s);
        return last.length();
    }
}