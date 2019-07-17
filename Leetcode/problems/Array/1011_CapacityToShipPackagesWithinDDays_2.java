class Solution {
/**
二分查找的思路：首先需要确认r和l表示的具体含义，是数组的下标还是其他含义，然后确认在满足什么条件下更新r和l
**/
    public int shipWithinDays(int[] weights, int D) {
    	int sum=sum_(weights);
    	int l=Math.max(max(weights),sum/D);
    	int r=sum;
    	while(l<=r){
    		int mid=(r+l)/2;
    		if(helper(weights,D,mid)){//可以满足要求
    			r=mid-1;
    		}else{
    			l=mid+1;
    		}
    	}
     return l;  
    }
    boolean helper(int[] weights,int d,int mid){
    	int tem=0;
    	for(int i=0;i<weights.length;i++){
    		tem+=weights[i];
    		if(tem==mid){
    			d--;
    			tem=0;
    		}
    		if(tem>mid){//加上i货物超，则下天运
    			tem=weights[i];
    			d--;
    		}
    	}
    	if (tem>0){
    		d--;
    	}
    	return d>=0;
    }
    int max(int[]a){
    	int m=a[0];
    	for(int i:a){
    		if(i>m){
    			m=i;
    		}
    	}
    	return m;
    }
    int sum_(int[]a){
    	int sum=0;
    	for(int i:a){
    		sum+=i;
    	}
    	return sum;
    }
}