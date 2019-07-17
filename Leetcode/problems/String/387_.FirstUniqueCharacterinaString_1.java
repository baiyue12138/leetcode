class Solution {
    public int firstUniqChar(String s) {
        int len=s.length();
        int[]a=new int[300];
        for(int i=0;i<len;i++){
        	a[s.charAt(i)]++;
        }
        for(int i=0;i<len;i++){
        	if(a[s.charAt(i)]==1){
        		return i;
        	}
        }
        return -1;
    }
}