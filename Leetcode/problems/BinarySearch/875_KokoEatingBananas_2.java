class Solution {
    public int minEatingSpeed(int[] piles, int H) {
    	int l=1;
    	int r=1000000000;
    	while(l<r){
    		int mid=l+(r-l)/2;//这样做是为了防止l和r太大，导致l+r溢出。
    		if(succeed(piles,mid,H)){
    			r=mid;
    		}else{
    			l=mid+1;
    		}
    	}
      return l; 
    }
    int average(int[]piles){
    	int sum=0;
    	for(int p:piles){
    		sum+=p;
    	}
    	return sum/piles.length;
    }
    boolean succeed(int[]piles,int K,int H){
    	int time=0;
    	for(int p:piles){
    		if(p%K!=0){
    			time+=1;
    		}
    		time+=p/K;
    	}
    	return time>H?false:true;
    }
}