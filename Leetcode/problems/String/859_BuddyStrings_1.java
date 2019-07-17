class Solution {
/**
对比两个字符串，如果长度不一样了，直接返回False；
之后扫描两个字符串，用t1,t2分别记录第一个和第二个不相同的字符的位置，同时用cnt记录不同的字符个数，
如果cnt不等于2或0直接返回False；
扫描完成后，麻烦一点的是cnt等于0的时候，因为有可能是A=”aa”,B=”aa”这样交换是符合的，如果A=”ab”,B=”ab”是不符合的，可以看到若要cnt等于0时符合需要A，B里同时存在两个相同的字符,所以先建立一个set集合，然后统计是否存在这样的字符即可。
**/
    public boolean buddyStrings(String A, String B) {
        int len1=A.length(),len2=B.length();
        if(len1!=len2) return false;
        int pos1=-1,pos2=-1;//不相等字符的两个位置
        int cnt=0;//不相等字符是数量
        for(int i=0;i<len1;i++){
        	if(A.charAt(i)!=B.charAt(i)){
        		if(pos1==-1){
        			pos1=i;
        		}else{
        			pos2=i;
        		}
        		cnt++;
        	}
        }
        if(cnt==0) {//统计A中是否存在相同字符
        int[]a=new int[26];
        for(int i=0;i<len1;i++){
        	if(a[A.charAt(i)-'a']>=1){
        		return true;
        	}else{
        		a[A.charAt(i)-'a']++;
        	}
        }
        return false;
        }
        if(cnt!=2) return false;
        if(A.charAt(pos1)==B.charAt(pos2)&&A.charAt(pos2)==B.charAt(pos1)) return true;
        return false;
    }
}