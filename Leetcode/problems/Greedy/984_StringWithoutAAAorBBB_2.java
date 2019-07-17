class Solution {
	/**
这个问题非常简单（其实这是一个数学问题），我们首先想到的解法是贪心算法。我们可以分成如下几种情况去判断
A=B 
A>B​ 
A<B
第一种情况很简单，我们直接返回'ab'*A（或'ab'*B）即可。对于第二种和第三种情况，我们都按照第二种考虑，对于第三种情况我们交换A,B即可。接着我们判断当A or B不为空的时候，如果A>B的话，我们就添加aab，否则我们添加ab。
**/
    public String strWithout3a3b(int A, int B) {
    	String str="";
    	String a="a";
    	String b="b";
    	if(B>A){
    		int t=B;
    		B=A;
    		A=t;
    		String s=a;
    		a=b;
    		b=s;
    	}
    	while(A>0||B>0){
    		if(A>0){
    			str+=a;
    			A-=1;
    		}
    		if(A>B){
    			str+=a;
    			A-=1;
    		}
    		if(B>0){
    			str+=b;
    			B--;
    		}
    	}
       return str;
    }
}