class Solution {
    public int findKthLargest(int[] nums, int k) {
    	int len=nums.length;
       for(int i=(len-1)/2;i>=0;i--){//建堆
       		downAjust(nums,i,len);
       }
       for(int i=len-1;i>len-k-1;i--){
       	int t=nums[0];
       	nums[0]=nums[i];
       	nums[i]=t;
       	downAjust(nums,0,i);
       }
      return nums[nums.length-k];
    }

    void downAjust(int[]nums,int parent,int len){    	
	    	int child=2*parent+1;//左孩子节点
	    	while(child<len){
	    		int tem=nums[parent];//父节点
	    		if(child+1<len&&nums[child+1]>nums[child]){//存在右节点，并且右节点的值较大
	    			child=child+1;
	    		}
	    		if(tem>=nums[child]) break;
	    		//与父节点交换节点
	    		int t=nums[child];
	    		nums[child]=nums[parent];
	    		nums[parent]=t;
	    		//交换节点之后，可能会破坏该孩子节点的结构使得以该节点的树不满足堆的要求，所以以该孩子为parent继续调整
	    		parent=child;
	    		child=2*child+1;
	    	}
	    }
}

