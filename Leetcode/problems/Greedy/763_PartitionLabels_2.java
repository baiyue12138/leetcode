class Solution {

/**
对于字符串S而言，其最左边的一组一定包含S最左边的第一个字母，然后检索该字母在S中最右边的位置，这里假设为i，如果从S最左边到i之间有一个字母最右边的索引在i右边，那么更新i，继续遍历，直到S最左端到i的字母已经全部遍历了一遍，这个时候0~i就是一个最小的分组，将S切分，对i+1到S最右端继续以上操作
1.定义一个map记录每个字符出现的最右边的位置
2.设置双指针start end
2.遍历字符串，同时更新窗口的右边位置（如果该位置的字符出现的最右边的位置大于end,则更新end）
4.if(end==i)表示已经遍历到这个窗口的结束位置，则重新开始一个片段，更新start
**/
    public List<Integer> partitionLabels(String S) {
    	List<Integer> list=new ArrayList<>();//用于记录结果
    	Map<Character,Integer> map=new HashMap<>();//记录每个字符在字符串中的最右边位置
    	for(int i=0;i<S.length();i++){
    		map.put(S.charAt(i),i);
    	}
    	int start=0,end=0;//双指针，表示窗口的左右位置
    	for(int i=0;i<S.length();i++){
    		end=Math.max(end,map.get(S.charAt(i)));//更新窗口的右边位置
    		if(end==i){//该片段内已经没有字符的位置超出end，计算该片段的长度
    			list.add(end-start+1);
    			start=end+1;
    		}
    	}
       return list; 
    }
}