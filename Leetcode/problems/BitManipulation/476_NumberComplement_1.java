class Solution {
    public int findComplement(int num) {
        int reu=0;
        int loc=0;
        while(num!=0){
            int v=num&1;
            if(v==0) reu+=Math.pow(2,loc);
            num=num>>1;
            loc++;
        }
        return reu;
    }
}