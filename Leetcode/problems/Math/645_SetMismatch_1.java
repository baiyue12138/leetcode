class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[]sum=new int[n];
        for(int i=0;i<n;i++){
        	sum[i]=0;
        }
        for(int i=0;i<n;i++){
        	sum[nums[i]-1]+=1;
        }
        int[]res=new int[2];
        for(int i=0;i<n;i++){
        	if(sum[i]==2) res[0]=i+1;
        	if(sum[i]==0) res[1]=i+1;
        }
        return res;
    }
}