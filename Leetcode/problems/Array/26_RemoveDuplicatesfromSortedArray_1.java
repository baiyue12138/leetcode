class Solution {
    /*
    这道题的思路就是采用两个标记点 number 和 i ，number记录不重复元素的位置，i从number的下一个开始遍历数组，如果i位置的数字    等于number位置的数字，说明该数字重复出现，不予处理；如果i位置的数字不等于number位置的数字，说明该数字没有重复，需要放到l的    下一位置，并使number加1。
    */
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<len;i++){
            if(nums[i]!=nums[count]){             
                nums[++count]=nums[i];     
            }
        }
        return count+=1;
    }
}