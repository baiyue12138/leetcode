//常数时间获取/删除/随机选择
class RandomizedSet {
		Set<Integer>set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
       	set=new HashSet<>(); 
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)){
        	return false;
        }else{
        	set.add(val);
        	return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
      if(set.contains(val)){
      	set.remove(val);
      	return true;
      } else{
      	return false;
      }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        if(set.size()==0) return 0;
        Integer[]array=set.toArray(new Integer[set.size()]);
        int index=(int)(Math.random()*set.size());
        return array[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
