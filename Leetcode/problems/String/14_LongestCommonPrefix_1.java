class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
        	char[]res2=res.toCharArray();
        	char[]strsi=strs[i].toCharArray();
        	res="";
        	for(int j=0;j<res2.length&&j<strsi.length;j++){
        		if(res2[j]==strsi[j]){
        			res+=res2[j];
        		}else{
        			break;
        		}
        		
        	}
        }
        return res;
    }
}