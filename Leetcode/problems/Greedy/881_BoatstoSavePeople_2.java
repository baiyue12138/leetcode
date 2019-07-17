class Solution {
    public int numRescueBoats(int[] people, int limit) {
      //排个升序，最小的和最大能和则和，不能和的大的单独坐。
      int i=0,j=people.length-1;
      Arrays.sort(people);
      int sum=0;
      while(i<=j){
      	if(people[i]+people[j]<=limit){
      		i++;
      		j--;  		
      	}else{
      		j--;
      	}
      	sum+=1;
      }
      return sum;
    }
}