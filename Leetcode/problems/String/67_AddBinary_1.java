class Solution {
/**
解决方法：用两个指针分别指向a和b的末尾，然后每次取出一个字符，转为数字，若无法取出字符则按0处理，然后定义进位offset，初始化为0，将三者加起来，对2取余即为当前位的数字，对2取商即为当前进位的值，最后整个while循环结束之后还要判断下offset，如果为1的话，要在结果最前面加上一个1，
'1'-'0'=1
**/
    public String addBinary(String a, String b) {
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();
        int len1=a1.length;
        int len2=b1.length;
        int i=len1-1,j=len2-1;
        int offest=0;//进位
        String s="";
        while(i>=0||j>=0){
        	int m= i>=0?a1[i--]-'0':0;
        	int n= j>=0?b1[j--]-'0':0;
        	int sum=m+n+offest;
        	s=String.valueOf(sum%2)+s;
        	offest=sum/2;
        }
        s= offest>0?"1"+s:s;
        return s;
    }
}