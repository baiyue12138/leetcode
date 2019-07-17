class Solution {
//非快乐数会陷入 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 循环，所以我们建立一个map用来统计每次出现数字的数量，当出现次数为2的时候跳出循环，如果该数是1则true,否则false
    public boolean isHappy(int n) {
    	while(n!=1&&n!=4){
    		int sum=0;
    		while(n!=0){
    			sum+=(n%10)*(n%10);
    			n/=10;
    		}
    		n=sum;
    	}
       return n==1; 
    }
}
