class Solution {
    public int findContentChildren(int[] g, int[] s) {
    //每一步选择满足该孩子胃口的最小的饼干
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int len2=s.length;
        int len1=g.length;
        int i=0,j=0;
        while(i<len1&&j<len2){
        	if(s[j]>=g[i]){
        		child++;
        		i++;
        		j++;
        	}else{
        		j++;
        	}
        }
        return child;
    }
}