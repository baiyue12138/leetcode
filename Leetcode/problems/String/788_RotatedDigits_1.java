class Solution {
    public int rotatedDigits(int N) {
        int sum=0;
        for(int i=1;i<=N;i++){
            String s=String.valueOf(i);
            if((s.indexOf("2")!=-1||s.indexOf("5")!=-1||s.indexOf("6")!=-1||s.indexOf("9")!=-1)&&(s.indexOf("3")==-1&&s.indexOf("4")==-1&&s.indexOf("7")==-1))
                sum++;
        }
        return sum;
        
    }
}