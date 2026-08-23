class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int i = 0;
        for(char c1 : jewels.toCharArray()) {
            for(char c2 : stones.toCharArray()) {
                if(c1 == c2) i++;
            }
        }

        return i;
    }
}