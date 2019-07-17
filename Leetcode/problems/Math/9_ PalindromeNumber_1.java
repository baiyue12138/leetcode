class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=x;
        int cmp=0;
        while(y!=0){
            cmp=cmp*10+y%10;
            y=y/10;
        }
        if(cmp==x)
            return true;
        return false;
    }
}