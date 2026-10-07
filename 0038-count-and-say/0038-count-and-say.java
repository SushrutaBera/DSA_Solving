class Solution {
    public String countAndSay(int n) {
        String start = "1";
        
        for (int i = 1; i < n; i++) {
            start = rle(start);
        }
        
        return start;
    }

    public String rle(String start) {
        StringBuilder replace = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < start.length(); i++) {
            char prev = start.charAt(i - 1);
            char curr = start.charAt(i);
            
            if (prev == curr) {
                count++;
            } else {
                replace.append(count).append(prev);
                count = 1;
            }
        }
        
        replace.append(count).append(start.charAt(start.length() - 1));
        
        return replace.toString();
    }
}