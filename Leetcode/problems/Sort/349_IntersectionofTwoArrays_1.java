class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int len=0;
        for(int i=0;i<nums1.length;i++){
        	map.put(nums1[i],0);
        }
        for(int i=0;i<nums2.length;i++){
        	if(map.containsKey(nums2[i])&&map.get(nums2[i])==0){
        		map.put(nums2[i],map.get(nums2[i])+1);
        		len++;//数组长度
        	}
        }
        int[]res=new int[len];
        int i=0;
        for(int key:map.keySet()){
        	if(map.get(key)>0){
        		res[i]=key;
        		i++;
        	}
        }
        return res;
    }
}