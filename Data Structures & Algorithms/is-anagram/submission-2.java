class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> roh = new HashMap<>();
        HashMap<Character, Integer> roh1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            roh.put(s.charAt(i),roh.getOrDefault(s.charAt(i),0)+1);
        }
        for (int r = 0; r < t.length(); r++) {
            roh1.put(t.charAt(r),roh1.getOrDefault(t.charAt(r),0)+1);
        }
        return roh.equals(roh1);
    }
}
