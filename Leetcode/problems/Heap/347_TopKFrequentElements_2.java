class Solution {
/**
1.维持一个长度为k的小顶堆，
2.每次和堆顶元素（最小值）比较，比它大就存入堆里
**/
    public List<Integer> topKFrequent(int[] nums, int k) {
    	//统计每个数的数量
    	Map<Integer,Integer>map=new HashMap<>();
    	for(int i=0;i<nums.length;i++){
    		if(map.containsKey(nums[i])){
    			map.put(nums[i],map.get(nums[i])+1);
    		}else{
    			map.put(nums[i],1);
    		}
    	}
    	//建立堆
    	PriorityQueue<Integer> queue=new PriorityQueue<>(k,new Comparator<Integer>(){
    		public int compare(Integer a,Integer b){
    			return(map.get(a)-map.get(b));
    		}
    	});
    	for(int key:map.keySet()){
    		if(queue.size()<k){
    			queue.add(key);
    		}else{
    			if(map.get(key)>map.get(queue.peek())){
    				queue.remove();
    				queue.add(key);
    			}
    		}
    	}
    	List<Integer>list=new ArrayList<>();
        while(!queue.isEmpty()){
        	list.add(queue.remove());
        }
        return list;
    }
}