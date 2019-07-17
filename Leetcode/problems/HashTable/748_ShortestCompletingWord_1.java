class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[]map=getMap(licensePlate);
        int min=Integer.MAX_VALUE;
        String res="";
        boolean flag=true;
        for(int i=0;i<words.length;i++){
        	flag=true;
        	int[]m=getMap(words[i]);
        	int len=words[i].length();
        	for(int j=0;j<26;j++){
        		if(m[j]<map[j]){	
        			flag=false;
        			break;
        		}
        	}
        	if(flag&&len<min){
        		min=len;
        		res=words[i];
        	}
        }
       return res;
        }
     int[] getMap(String word){
        	 int[]map=new int[26];
        	String license=word.toLowerCase();
        	for(int i=0;i<license.length();i++){
        		if(license.charAt(i)>='a'&&license.charAt(i)<='z')
        			map[license.charAt(i)-'a']++;
        	}
        	return map;
        	}
}