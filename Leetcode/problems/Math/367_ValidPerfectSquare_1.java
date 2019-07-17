class Solution {
    public boolean isPerfectSquare(int num) {
         long left=0 ,right=(long)num+1;   
     boolean ans=false;
      while(left<right){
      	long mid=(left+right)/2;
      	if((long)mid*mid==num){  	
      		ans=true;
      		break;
      	}else{
      		if((long)mid*mid<num){
          		left=mid+1;       	
          	}
      		else{
          		right=mid;
          	}
      	}  
      }
     
      	return ans;
    }
}