class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=left;i<=right;i++){
        	if(selfDividing(i)){
        		list.add(i);
        	}
        }
        return list;
    }
    boolean selfDividing(int t){
      if(t==0) return false;
    	int tem=t;
    	while(tem!=0){
    		int m=tem%10;
        if(m==0) return false;
    		if(t%m!=0){
    			return false;
    		}
    		tem=tem/10;
    	}
    	return true;
    }
}