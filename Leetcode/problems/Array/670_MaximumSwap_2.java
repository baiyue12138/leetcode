class Solution {
//2736
//6372
//0123
    public int maximumSwap(int num) {
        List<Integer>list=new ArrayList<>();
        while(num!=0){
        	list.add(num%10);
        	num=num/10;
        }
        if(list.size()==1) return list.get(0);
        int sum=0;
        for(int i=list.size()-1;i>0;i--){
        	int max=-1;
        	int k=0;
        	for(int j=i-1;j>=0;j--){//找到这里的最大值
        		if(list.get(j)>=max){
        			max=list.get(j);
        			k=j;
        		}
        	}
        	if(list.get(i)<max){
        	//交换
        		int tem=list.get(i);
        		list.set(i,list.get(k));
        		list.set(k,tem);
        		break;
        	}
        }
         for(int i=list.size()-1;i>=0;i--){
         	sum=sum*10+list.get(i);
         }
        return sum;
    }
}