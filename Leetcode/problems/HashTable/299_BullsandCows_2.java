class Solution {
	//先统计公牛的数量，a和b一一对比，同一位置的相同字符的数量为公牛的数量。然后统计所有相同字符的数量作为公牛和母牛的数量之和
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        int len=secret.length();
        int []map1=new int[10];
        int []map2=new int[10];
        for(int i=0;i<len;i++){
        	if(secret.charAt(i)==guess.charAt(i)){
        		bulls++;
        	}
        	map1[secret.charAt(i)-'0']++;
        	map2[guess.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
        	cows+=map2[i]<map1[i]?map2[i]:map1[i];
        }
        cows=cows-bulls;
        StringBuilder sb=new StringBuilder();
        sb.append(bulls).append("A").append(cows).append("B");
        return sb.toString();
    }
}