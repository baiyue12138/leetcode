class Solution {
    public String intToRoman(int num) {
    	if(num<=0) return "";
        String[]key={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[]value={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        StringBuilder sb=new StringBuilder();
        int nums=num;
        while(nums>0){
        	int i=binarySearch(nums,value);//使用二分查找的方法找到<=num的最大值的下标
        	sb.append(key[i]);
        	nums-=value[i];
        }
        return sb.toString();
    }
   	int binarySearch(int num,int[]value){
   		int k=0;
   		int i=0;
   		for(;i<value.length;i++){
   			if(value[i]>num){
   				k=i-1;
   				break;
   			}
   		}
   		if(value[value.length-1]<=num) k=value.length-1;
   		return k;
   	}
}