class Solution {
	//map，key为list1中的值。value为下标，然后在map查找list2中的word,查找就计算这两个下标和
    public String[] findRestaurant(String[] list1, String[] list2) {
    	int min=Integer.MAX_VALUE;
    	List<String>list=new ArrayList<>();
    	Map<String,Integer>map=new HashMap<>();
    	for(int i=0;i<list1.length;i++){
    		map.put(list1[i],i);
    	}
    	for(int i=0;i<list2.length;i++){
    		if(map.containsKey(list2[i])){
    			int pos=i+map.get(list2[i]);
    			if(min==pos){
    				list.add(list2[i]);
    			}
    			if(min>pos) {
    				min=pos;
    				list.clear();//当遇到更小的pos就将原先的结果删除
    				list.add(list2[i]);
    			}
    		}
    	}
    	return list.toArray(new String[list.size()]);
    }
}
