class Solution {
    public int arrangeCoins(int n) {
        int sum=0;
        int i=0;
        for(;i<n;i++){
        	sum+=i;
        	if(n-sum<i+1){
        		break;
        	}
        }
        return i;
    }
}