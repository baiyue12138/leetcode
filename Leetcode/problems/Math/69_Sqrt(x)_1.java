class Solution {
    public int mySqrt(int x) {
        long left=0 ,right=(long)x+1;
        
       long ans=0;
        while(left<right){
        	long mid=(left+right)/2;
        	if((long)mid*mid<=x){
        		left=mid+1;
        		ans=mid;
        	}
        	else{
        		right=mid;
        	}
        }
       
        	return (int)ans;
    
    }
}