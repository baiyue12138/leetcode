class Solution {
    public int lengthOfLongestSubstring(String s) {
      /**
      滑动窗口法：定义两个指针，start和end，代表当前窗口的开始和结束位置，同样使用hashset,当窗口中出现重复的字符时，start++,没有重复时，end++,每次更新长度的大值
      **/
        HashMap<Character,Integer> map=new HashMap<>();//用于存储子串及对应的下标
        int maxlen=0;//字串长度
        int start=0,end=0;
        int n=s.length();
        while(start< n && end < n){//end也表示当前访问的字符
        	if(map.containsKey(s.charAt(end))){//如果包含这个字符
        		map.remove(s.charAt(start++));
        	}else{
        		map.put(s.charAt(end++),end);
            maxlen=Math.max(maxlen,end-start);
        	}
        }
        return maxlen;
    }
}
