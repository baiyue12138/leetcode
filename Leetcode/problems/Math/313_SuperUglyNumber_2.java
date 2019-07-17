class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
    	int[]ugly=new int[n];
    	int len=primes.length;
    	int[]p=new int[len];
    	ugly[0]=1;
    	for(int i=1;i<n;i++){
    		int min=ugly[p[0]]*primes[0];
    		for(int j=1;j<len;j++){
    			if(min>ugly[p[j]]*primes[j]) min=ugly[p[j]]*primes[j];
    		}
    		for(int j=0;j<len;j++){
    			if(min==ugly[p[j]]*primes[j]) p[j]++;
    		}
    		ugly[i]=min;
    	}
    	return ugly[n-1];
        
    }
}
