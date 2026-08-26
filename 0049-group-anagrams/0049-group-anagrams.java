class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> str = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String t = getSignature(strs[i]);
            if(!map.containsKey(t)) {
                map.put(t, new ArrayList<>());   
            }
            map.get(t).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    static String getSignature(String s) {
        char cs[] = s.toCharArray();
        Arrays.sort(cs);
        return new String(cs);
    }
}