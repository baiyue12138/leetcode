class Solution {
/**
1.维持一个长度为k的大顶堆，
**/
    public String frequencySort(String s) {
      if(s.length()==0||s==null){
        return "";
      }
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i))){
        		map.put(s.charAt(i),map.get(s.charAt(i))+1);
        	}else{
        		map.put(s.charAt(i),1);
        	}
        }
        //建堆
        PriorityQueue<Character> queue=new PriorityQueue<>(map.size(),new Comparator<Character>(){
        	public int compare(Character a,Character b){
        		return map.get(b)-map.get(a);
        	}
        });
        //插入数据
        for(Character key:map.keySet()){
        	queue.add(key);
        }
        //输出数据
        StringBuilder sb=new StringBuilder();
        while(!queue.isEmpty()){
        	char c=queue.poll();
        	int num=map.get(c);
        	while(num>0){
        		sb.append(c);
        		num--;
        	}
        }
        return sb.toString();
    }
}