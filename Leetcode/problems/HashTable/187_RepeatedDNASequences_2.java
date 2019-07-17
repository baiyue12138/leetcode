class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String>list=new ArrayList<>();
        if(s.length()<10) return list;
        Map<String ,Integer>map=new HashMap<>();
        for(int i=0;i<=s.length()-10;i++){
        	String sub=s.substring(i,i+10);
        	if(map.containsKey(sub)&&!list.contains(sub)){
        		list.add(sub);
        	}else{
        		map.put(sub,1);
        	}
        }
        return list;
    }
}