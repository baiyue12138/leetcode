class Solution {
	/**
	*1.如果某个字符的数量超过字符串长度的一半，那么就返回"",先选数量最多的元素进行排列
	*2.然后将字符和其数量组成一对，然后从大到小进行排序，每次选出两个数量最多的字符组成新的字符串
	*3.将选出的字符的数量减一在进行排序(可以使用堆进行排序)
	*4.直到只省最后一个字符时，如果该字符数量为1则保留，否则返回""
	**/
	class Pair{
		public int count;
		public char c;
		Pair(int count,char c){
			this.count=count;
			this.c=c;
		}
	}
    public String reorganizeString(String S) {
    	//统计每个字符的数量
    	int[]counts=new int[26];
    	for(int i=0;i<S.length();i++){
    		counts[S.charAt(i)-'a']++;
    	}
    	//创建优先队列
    	PriorityQueue<Pair>q=new PriorityQueue<Pair>(26,new Comparator<Pair>(){
    		public int compare(Pair a,Pair b){
    			return b.count-a.count;
    		}
    	});
        //构建堆，并且如果字符数量大于长度的一半就返回""
        for(int i=0;i<26;i++){
        	if(counts[i]>(S.length()+1)/2) return "";
        	if(counts[i]>0){
        		q.add(new Pair(counts[i],(char) (i + 'a')));
        	}
        }
        StringBuilder sb=new StringBuilder();
        //每次取出两个字符
        while(q.size()>1){
        	Pair p1=q.poll();
        	Pair p2=q.poll();
        	sb.append(p1.c);
        	sb.append(p2.c);
        	if(--p1.count>0) q.add(p1);
        	if(--p2.count>0) q.add(p2);
        }
        if(q.size()==1){
        	Pair p=q.poll();
        	if(p.count>1) return "";
        	sb.append(p.c);
        }
        return sb.toString();
    }
}
