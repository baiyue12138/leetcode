class Solution {
    /*
    思路：先排序，然后比较这两个数组，找到不同的地方
    */
    public int findUnsortedSubarray(int[] nums) {
        int start=-1,end=-1;
        int []nums2=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            nums2[i]=nums[i];
        }
        Arrays.sort(nums2);
        boolean startFlag=true;
        for (int i=0;i<nums.length;i++){
            if(nums2[i]!=nums[i]){
                if(startFlag==true){
                   start=i;
                    end=i; 
                    startFlag=false;
                }else{
                    end=i;
                }
                
            }
                
        }
        if(end==start) return 0;
        else return end-start+1;
    } 
}