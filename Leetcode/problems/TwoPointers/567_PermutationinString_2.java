class Solution {
    public boolean checkInclusion(String s1, String s2) {
    /**
    s1 = "abo" s2 = "eidbcbaooo"
    1.借助1个数组用来存储s1中各字符出现的次数
    2.设置双指针left和right,right用于遍历数组，left是滑动窗口的左位置
    3.if 当前位置的字符在数组中，则数组中该字符的数量减一，窗口减一
    4.if 达到窗口的大小时返回true
    5.
    **/
    int[] map = new int[26];
        for(char ch : s1.toCharArray()) {
            map[ch - 'a']++;
        }
        boolean result = false;
        int left = 0, right = 0;
        int len = s1.length();
        int counter = len;
        char[] ss = s2.toCharArray();
        for(right = 0; right < ss.length; ++right){
            if(--map[ss[right]-'a'] >= 0) {
                counter--;
            }
            if(counter == 0) {
                result = true;
                break;
            }
            if(right - left + 1 == len){
                if(++map[ss[left]-'a'] > 0){//之所以所有的都可以加，是因为之前的都进行了减操作
                    counter++;
                }
                left++;//窗口左端右移
            }
        }
        return result;
    }
   
}