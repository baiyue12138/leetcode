class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<J.length();i++){
        	if(!map.containsKey(J.charAt(i))){
        		map.put(J.charAt(i),0);
        	}
        }
       for(int i=0;i<S.length();i++){
        	if(map.containsKey(S.charAt(i))){
        		map.put(S.charAt(i),map.get(S.charAt(i))+1);
        	}
        }
        int sum=0;
        for(char key:map.keySet()){
        	if(map.get(key)>0){
        		sum+=map.get(key);
        	}
        } 
        return sum;
    }
}