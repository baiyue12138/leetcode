class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + k == nums[j])
                    map.put(nums[i], nums[j]);
                else if(nums[j] > nums[i] + k)
                    break;
            }
        return map.size();
    }
}