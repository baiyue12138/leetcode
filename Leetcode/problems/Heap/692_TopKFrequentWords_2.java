class Solution {
//我们在设计比较器的时候，要让字母序大的在前面，比如a,b的出现次数相同，我们在比较器中先让b处在a的前面
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
        	if(map.containsKey(words[i])){
        		map.put(words[i],map.get(words[i])+1);
        	}else{
        		map.put(words[i],1);
        	}
        }
        //建xiao顶堆
        PriorityQueue<String> queue=new PriorityQueue<>(k,new Comparator<String>(){
        	public int compare(String a,String b){
        		return (map.get(b)-map.get(a))==0?b.compareTo(a):map.get(a)-map.get(b);
        	}
        });
        //插入数据
        for (String word : map.keySet()) {
            queue.offer(word);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        //输出数据
        List<String>list=new ArrayList<>();
        while(!queue.isEmpty()){
        	list.add(queue.poll());
        }
        Collections.reverse(list);
        return list;   
}
}