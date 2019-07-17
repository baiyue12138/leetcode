class Solution {
//使用一个map,两个句子中的单词都往里放，最后统计个数为1 的单词就可以
    public String[] uncommonFromSentences(String A, String B) {
        List<String>list=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        String[]a=A.split(" ");
        String[]b=B.split(" ");
        for(String word:a){
        	if(map.containsKey(word)){
        		map.put(word,map.get(word)+1);
        	}else{
        		map.put(word,1);
        	}
        }
        for(String word:b){
        	if(map.containsKey(word)){
        		map.put(word,map.get(word)+1);
        	}else{
        		map.put(word,1);
        	}
        }
        for(String key:map.keySet()){
        	if(map.get(key)==1){
        		list.add(key);
        	}
        }
        return list.toArray(new String[list.size()]);
    }
}