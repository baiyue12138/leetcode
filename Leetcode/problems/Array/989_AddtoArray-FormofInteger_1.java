class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
    	List<Integer> list=new ArrayList<>();
    	List<Integer> B=new ArrayList<>();
    	int len=A.length;
    	while(K>0){
    		B.add(K%10);
    		K=K/10;
    	}
    	int len2=B.size();
    	int i=len-1,j=0;
    	int offest=0;
    	while(i>=0||j<len2){
    		int m= i>=0 ? A[i--]:0;
    		int n= j<len2? B.get(j++):0;
    		int sum=m+n+offest;
    		list.add(sum%10);
    		offest=sum/10;
    	}
      if(offest>0){ list.add(1);}
    	Collections.reverse(list);
    	return list;
     
    }
}