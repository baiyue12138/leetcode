class Solution {
    public int repeatedNTimes(int[] A) {
        //依照题意，其他数字只能出现一次，所以只要出现重复就返回结果
        int len=A.length;
        Arrays.sort(A);
        for(int i=0;i<len-1;i++){
        	if(A[i]==A[i+1]) return A[i];
        }      
        return 0;
    }
}