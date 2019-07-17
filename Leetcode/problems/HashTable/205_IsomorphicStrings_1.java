class Solution {
//使用map，s中的字符作为key，t中的字符作为value，如果存在key，则判断value是否和t中当前字符相同，不相同返回false
    public boolean isIsomorphic(String s, String t) {
    	if(s.length()!=t.length()) return false;
        Map<Character,Character>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i))){
        		if(map.get(s.charAt(i))!=t.charAt(i)){
        			return false;
        		}
        	}else{
            if(map.containsValue(t.charAt(i))){//已经存在这个value其他字符不可以再映射到这个value
                    return false;
                }
        		map.put(s.charAt(i),t.charAt(i));
        	}
        }
        return true;
    }
}
