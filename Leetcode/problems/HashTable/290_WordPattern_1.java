//290.单词模式
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[]strlist=str.split(" ");
        if(pattern.length()!=strlist.length) return false;
        Map<Character,String>map=new HashMap<>();
        for(int i=0;i<strlist.length;i++){
        	if(map.containsKey(pattern.charAt(i))){
        		if(!(map.get(pattern.charAt(i)).equals(strlist[i]))){
        			return false;
        		}
        	}else{
        		if(map.containsValue(strlist[i])){//已经存在这个value,其他字符不可以再映射到这个value
                    return false;
                }
        		map.put(pattern.charAt(i),strlist[i]);
        	}
        }
        return true;
    }
}