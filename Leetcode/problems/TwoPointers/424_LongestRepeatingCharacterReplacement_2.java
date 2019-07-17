class Solution {
    public int characterReplacement(String s, int k) {
        //双指针（滑动窗口，左指针为窗口的左边位置，右指针为遍历数组的下标）要配合数组或者map使用
    	int n = s.length();
    	if ( n == 0 ) {
    		return 0;
    	}
    	int[] map=new int[26];//将字母映射到map中，key:字母-‘A’    value:字母在字符串中出现的次数 
    	map[s.charAt(0)-'A']++;//统计字符串s中的第一个字母出现次数  
    	int most = map[s.charAt(0)-'A']; //most:记录字符串s中出现次数最多的字母，初始化为s[0]出现的次数
    	int res = 1; //替换后最长子串长度   
    	int left = 0; //定义窗口，left：窗口左侧
    	for( int right = 1 ; right < n; right++) { //right:窗口右侧
    		map[s.charAt(right)-'A']++;//统计右移的窗口对应的字母的出现次数，放在map中
    		most = Math.max(most, map[s.charAt(right)-'A']); //修改most值，判断原有窗口出现次数最多的字母，与新进窗口的字母出现次数比较，most取大的那个
    		if( right - left + 1 > most+k ) { //如果窗口大于出现次数最多的字母出现次数与k的和，则需要修改窗口
    			map[s.charAt(left)-'A']--; //移除窗口的字母出现次数减一
    			left++;  //窗口左侧右移
    		} else {
    			res = Math.max(res, right-left+1);//保持窗口>当前最大值res的情况下，我们才看是否满足others <= k，满足才更新
    		}
    	}
    	return res;
    }
}