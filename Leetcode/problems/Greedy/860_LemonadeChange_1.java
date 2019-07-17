class Solution {
/**
思路：
1.记录目前有的钞票数
2.如果来的人给了5元，直接过，5元钞票数++
3.如果来的人给了10元，只要至少还有一张5元的，就给过
4.如果给了20元，优先把10元的钞票退出去（10元钞票只有在这里才能退出去），然后退5元的，退不了就失败
**/
    public boolean lemonadeChange(int[] bills) {
        int bill5=0,bill10=0;
        for(int i=0;i<bills.length;i++){
        	int bill=bills[i];
        	if(bill==5){
        		bill5++;
        	}
        	if(bill==10){
        		bill10++;
        		bill5--;
        	}
        	if(bill==20){
        		bill5--;
        		if(bill10==0){//先退10块的
        			bill5-=2;
        		}else{
        			bill10-=1;
        		}
        	}
        	if(bill5<0||bill10<0)
        		 return false;
        }
        return true;
    }
}