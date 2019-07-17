class MapSum {
	Map<String ,Integer>map;
    /** Initialize your data structure here. */
    public MapSum() {
       map=new HashMap<>(); 
    }
    
    public void insert(String key, int val) {
        	map.put(key,val);
    }
    
    public int sum(String prefix) {
    	int sum=0;
        int len=prefix.length();
        for(String key:map.keySet()){
        	if(key.length()>=len){
        		if(key.substring(0,len).equals(prefix)){
        			sum+=map.get(key);
        		}
        	}
        }
        return sum;
    }
}