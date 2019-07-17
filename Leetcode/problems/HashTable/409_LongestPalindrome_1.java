class Solution {
	//统计每个字符的个数，然后res+=num/2*2得到偶数次的数量，如果res比字符串短，则正明存在奇数的字符，随机选择一个奇数字符放中间
    public int longestPalindrome(String s) {
    	if(s.length()<1) return 0;
       int[]num=new int[256];//最多有256个字符
       for(int i=0;i<s.length();i++){
       	num[s.charAt(i)]++;
       }
       int res=0;
       for(int i:num){
       	res+=i/2*2;
       }
       if(res<s.length()){
       	res++;
       }
        return res;
    }
}