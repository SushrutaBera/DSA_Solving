class Solution {
    public String reverseStr(String s, int k) {
        int l = s.length();
        int counter = 0;
        String nes = "";
        for(int i = 0; i < s.length(); i += k) {
            String t = "";

            if(k + i <= l) t = s.substring(i, i + k);
            else t = s.substring(i, l);
            
            if(counter % 2 == 0) nes += new StringBuilder(t).reverse().toString();
            else nes += t;
            
            counter++;
        }
        
        return nes;
    }
}