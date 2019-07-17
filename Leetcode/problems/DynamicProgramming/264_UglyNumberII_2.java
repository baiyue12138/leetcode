class Solution {
    public int nthUglyNumber(int n) {
       // https://blog.csdn.net/u010912383/article/details/51940940
       int[]ugly=new int[n];
       //设置三个指针
       int two=0;
       int three=0;
       int five=0;
       ugly[0]=1;
       for(int i=1;i<n;i++){
       	int num=min(ugly[two]*2,ugly[three]*3,ugly[five]*5);
       	if(num==ugly[two]*2){
       		two++;
       	}
       	if(num==ugly[three]*3){
       		three++;
       	}
       	if(num==ugly[five]*5){
       		five++;
       	}
       	ugly[i]=num;
       }
       return ugly[n-1];
	}
	int min(int a,int b,int c){
		if(a>b) a=b;
		if(a>c) a=c;
		return a;
	}
}