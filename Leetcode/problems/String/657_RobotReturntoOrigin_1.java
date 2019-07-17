class Solution {
    //基本思路是统计每个字符出现的次数，if num(U)==num(D)&&num(R)==num(L) return true;
    public boolean judgeCircle(String moves) {
        int numU=0,numD=0,numL=0,numR=0;
        char[]move=moves.toCharArray();
        for(char c:move){
            switch(c){
                case 'U':
                {
                   numU++;
                    break; 
                }
                case 'D':
                {
                   numD++;
                    break; 
                }
                case 'L':
                {
                   numL++;
                    break; 
                }
                case 'R':
                {
                   numR++;
                    break; 
                }
                    
            }
        }
        if(numU==numD&&numL==numR)
            return true;
        return false;
        
    }
}