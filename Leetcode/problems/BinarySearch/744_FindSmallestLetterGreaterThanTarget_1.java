class Solution {
// a b b b b c d
// 0 1 2 3 4 5 6
//b
    public char nextGreatestLetter(char[] letters, char target) {
    	int len=letters.length;
        if(target>=letters[len-1]) return letters[0];
        int left=0,right=len-1;
        while(left<right){
        	int mid=(left+right)/2;
        	if(letters[mid]>target){
        		right=mid;
        	}else{
        		left=mid+1;
        	}
        }
       return letters[left];
    }
}