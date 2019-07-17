class Solution {
   public int findDuplicate(int[] nums) {
 /**
 思路：因为数组的n+1个数字的范围都在 1～n之间，所以 重复数字肯定在1～n之间。而最终的重复数字不是在原数组中找的，是根据下标在 1～n这个范围中找的。eg：数组[1,3,3,3,4]在 1~3之间有重复数字，且 <=3的个数为4。而4>3，所以重复数在1~3之间，而不再 3~4之间。数组[1,2,3,4,4,5]在1~3之间没有重复数字，且<=3的个数为3。而 3 <= 3成立，所以重复数组在3+1=4~5之间，而不再1~3之间。
 **/
        // start、 end、middle都是指向1～n范围的下标，不是指向nums数组的下标
		int start = 0;
		int end = nums.length - 1;
 
        
		while (start < end) {
			int count = 0;
			int middle = (start + end) / 2;
 
		    // 统计nums数组中 <= middle值 的个数,这个个数<=middle个就表示前middle没有重复
            // start重新指向 middle+1,否则 就表示middle前面重复的数字，end重新指向middle
        	for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= middle) {
					count++;
				}
			}
			
			if (count <= middle) {
				start = middle+1;
			} else {
				end = middle;
			}
		}
 
		return start;
	}  
}