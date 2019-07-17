class Solution {
    public boolean hasAlternatingBits(int n) {
        if(n==0||n==1) return true;
        boolean flag=true;
        int v=n&1;
        n=n>>1;
        while(n!=0){
            int x=(n&1);
            if(v==x) {flag=false;break;}
            else {v=x;n=n>>1;}
        }
        return flag;
    }
}