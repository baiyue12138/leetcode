class Solution {
//思路：注意小于0的情况。3次遍历数组，分别找出第一大的数，第二大的数，第三大的数。
    public int thirdMax(int[] nums) {
    //使用计数排序的方法
        int len=nums.length;
        if(len<=0) return 0;
        boolean flag=false;
        int max=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for(int i:nums){//找到最大的值
        	if(max<i) max=i;
        }
       for(int i:nums){//找到第二大的值
        	if(max>i&&i>=second) second=i;
        }
        for(int i:nums){//找到第3大的值
        	if(second>i&&i>=third) {
        	third=i;
        	flag=true;
        	}
        }
        return flag?third:max;
    }
}