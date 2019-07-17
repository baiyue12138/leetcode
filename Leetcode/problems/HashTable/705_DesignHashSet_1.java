class MyHashSet {
	//采用除留余数法构造哈希表，使用链地址法处理地址冲突
    Entry [] lists;//哈希表
    int size; 
    class Entry{
        int key;
        Entry next;
        public Entry(int v) { key = v; next = null;}
    }
    /** Initialize your data structure here. */
    public MyHashSet() {
         size = 10007;
        lists = new Entry [size];
    }
    
    public void add(int key) {
        int hashcode = key % size;//采用除留余数法得到哈希地址
        Entry e = lists[hashcode];
        if(e == null)
            lists[hashcode] = new Entry(key);
        else{
            while(e != null && e.key != key)
                e = e.next;
            if(e == null)
            {//不存在该key,
                Entry ne = new Entry(key);
                ne.next = lists[hashcode];//在链表头部插入数据
                lists[hashcode] = ne;
            }          
        }
    }
    
    public void remove(int key) {
        int hashcode = key % size;
        Entry e = lists[hashcode];
        Entry pre = null;
        while(e != null && e.key != key){
            pre = e;
            e = e.next;
        }
        if(e != null){//存在
            if(pre == null)
                lists[hashcode] = e.next;
            else
                pre.next = e.next;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hashcode = key % size;
        Entry e = lists[hashcode];
        while(e != null && e.key != key)
            e = e.next;
        return e == null ? false : true;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */