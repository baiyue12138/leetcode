class Solution {
     public String toHex(int num) {
        String s="";
        if(num==0) return "0";
        char[] map={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while(num!=0 && (s.length()<8)){
            s=map[num&0xf]+s;
            num=num>>4;
        }
        return s;
    }
}