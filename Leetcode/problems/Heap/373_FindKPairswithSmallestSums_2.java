class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]>list=new ArrayList<>();
        Queue<int[]>queue=new PriorityQueue<>(k,new Comparator<int[]>(){
        	public int compare(int[]a,int[]b){
        		return (b[0]+b[1])-(a[0]+a[1]);
        	}
        });
        for(int i=0;i<nums1.length;i++){
        	for(int j=0;j<nums2.length;j++){
        		int t=nums1[i]+nums2[j];   		
        		if(queue.size()<k){
    				  queue.add(new int[]{nums1[i],nums2[j]});
    			}else{
             int[]tem= queue.peek();
    				if(t<(tem[0]+tem[1])){
    					queue.remove();
    					queue.add(new int[]{nums1[i],nums2[j]});
    			}		
        	}
        }
        }
        while(!queue.isEmpty()){
        	list.add(queue.poll());
        }
        return list;
    }
}