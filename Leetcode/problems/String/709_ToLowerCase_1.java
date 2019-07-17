class Solution {
    public String toLowerCase(String str) {
        char[]ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&&ch[i]<='Z'){
                ch[i]+=32;
            }
        }
        return new String(ch);
    }
}