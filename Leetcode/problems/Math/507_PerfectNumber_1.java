class Solution {
    public boolean checkPerfectNumber(int num) {
    	if(num<=3) return false;
        if(perfectNumber(num)==num) return true;
        return false;
    }
    int perfectNumber(int num){
    	int sum=1;
    	for(int i=2;i<Math.sqrt(num);i++){
    		if(num%i==0){
    			sum+=i;
    			sum+=num/i;
    		}
    	}
    	return sum;
    }
}