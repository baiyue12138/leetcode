class Solution {
    public String reverseOnlyLetters(String S) {
        char[]ch=S.toCharArray();
        int left=0,right=ch.length-1;
        while(left<=right){
            
            if((ch[left]>='a'&&ch[left]<='z'||ch[left]>='A'&&ch[left]<='Z')&&(ch[right]>='a'&&ch[right]<='z'||ch[right]>='A'&&ch[right]<='Z'))
               {
                   char tem=ch[left];
                   ch[left]=ch[right];
                   ch[right]=tem;
                   left++;
                   right--;
               }else{
                if((ch[left]<'a'||ch[left]>'z')&&(ch[left]<'A'||ch[left]>'Z')) left++;
                if((ch[right]<'a'||ch[right]>'z')&&(ch[right]<'A'||ch[right]>'Z')) right--;
            }
              
        }
        return new String(ch);
    }
    
}