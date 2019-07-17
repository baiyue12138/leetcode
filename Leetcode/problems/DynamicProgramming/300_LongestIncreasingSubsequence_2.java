class Solution {
/**
1.首先将第一个元素存入vec数组，
2.然后依次看后面的元素。
3.若后面的元素大于vec数组的最后一个元素，则将其加入到vec末尾，
4.否则将它替换掉vec数组中第一个大于等于它的元素。
5.最后返回vec的大小即可。
**/
    public int lengthOfLIS(int[] nums) {
    	int len=nums.length;
    	if(len==0) return 0;
      	if(len==1) return 1;
    	int[] tem=new int[len];
    	int temlen=0;
    	tem[0]=nums[0];
    	temlen+=1;
    	for(int i=1;i<len;i++){
    		if(nums[i]>tem[temlen-1]){
    			tem[temlen]=nums[i];
    			temlen++;
    		}else{
    		//使用二分查找法查找tem中第一个大于nums[i]的下标，并将该值修改为nums[i]
    		int l=0,r=temlen-1;
    		while(l<r){
    			int mid=(l+r)/2;
    			if(tem[mid]>=nums[i]){
    				r=mid;
    			}else{
    				l=mid+1;
    			}
    		}
    		tem[l]=nums[i];
    		}
    	}
    return temlen;  
    }
}