class Solution {
    public static int romanToInt(String s) {
	        int tem=0;
	        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
	        char[]ch=s.toCharArray();
	        for(int i=0;i<ch.length;i++){
	        	if(i+1>=ch.length||map.get(ch[i+1])<=map.get(ch[i])){
	        		
	        		tem+=map.get(ch[i]);
	        		
	        		
	        	}else{
	        		tem-=map.get(ch[i]);
	        		
	        		
	        	}
	        }
	        return tem;
	    }
}