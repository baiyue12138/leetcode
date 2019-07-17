class Solution {
/**
思路：如果x>y那么返回x-y
如果x<y且y%2==0,y/2,否则，y+=1,
**/
    public int brokenCalc(int X, int Y) {
    	int sum=0;
    	
    	while(X!=Y){
        if(X>Y) 
        {
          sum+= X-Y;
          break;
        }
    		if(Y%2==0){
    			Y/=2;
    			sum++;
    		}else{
    			Y+=1;
    			sum++;
    		}
    	}
    return sum;   
    }
}