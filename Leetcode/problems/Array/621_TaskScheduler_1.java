class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
 
        for (int i = 0; i < tasks.length; i++) {
            count[tasks[i]-'A']++;
        }//统计词频
 
        Arrays.sort(count);//词频排序，升序排序，count[25]是频率最高的
 
        int temp = 25;//最多有25个字母和频率最高的字母相同频率
        while ( temp >= 0 && count[25] == count[temp]){
            temp--;
        }
 
        return Math.max((count[25] - 1) * (n + 1) + 25 - temp , tasks.length);
    }
}
