class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) {
            return ans;
        }
        
        int[] dict = new int[26];
        for (char c : p.toCharArray()) {
            dict[c - 'a']++;
        }
        
        int[] cur = new int[26];
        for (int i = 0; i < p.length() - 1; i++) {
            cur[s.charAt(i) - 'a']++;
        }

        for (int i = p.length() - 1; i < s.length(); i++) {
            cur[s.charAt(i) - 'a']++;
            if (isSame(dict, cur)) {
                ans.add(i - p.length() + 1);
            }
            cur[s.charAt(i - p.length() + 1) - 'a']--;
        }
        return ans;
    }
    
    private boolean isSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}