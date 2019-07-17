class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;
        Arrays.sort(citations);
        int res = 0;
        for (int i = citations.length - 1; i >= 0; i--)
                if (citations[i] > res) res++;
        return res;
    }
}