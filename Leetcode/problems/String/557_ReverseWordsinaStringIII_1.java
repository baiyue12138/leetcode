class Solution {
    public String reverseWords(String s) {
       int len=s.length();
      if(len<=1) return s;
      char[]arr=s.toCharArray();
      int start=0;
      while(start<len){
        int end=s.indexOf(" ",start);
        if(end==-1){
          reverse(arr,start,len-1);
          break;
        }else{
          reverse(arr,start,end-1);
          start=end+1;
        }
      }
      return String.valueOf(arr);
    }
  void reverse(char[]arr,int s,int e){
    while(s<e){
      char tem=arr[s];
      arr[s]=arr[e];
      arr[e]=tem;
      s++;
      e--;
    }
  }
}