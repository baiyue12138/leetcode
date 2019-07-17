class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0)&&(n&(n-1))==0;
        
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1) return true;
        if(n==0)return false;
        while(n!=1&&n%2==0){
        
                n=n/2;
           
        }
        if(n==1)return true;
        else return false;
        
    }
}