class Solution {
    public List<String> commonChars(String[] A) {
        int[][]t=new int[A.length][26];
        for(int i=0;i<A.length;i++){
        	char[]c=A[i].toCharArray();
        	for(int j=0;j<c.length;j++){
        		t[i][c[j]-'a']++;
        	}
        }
        List<String>list=new ArrayList<>();
        for(int j=0;j<26;j++){
        	int sum=Integer.MAX_VALUE;
        	for(int i=0;i<t.length;i++){
        		if(t[i][j]<sum) sum=t[i][j];
        	}
        	for(int k=0;k<sum;k++){
        		list.add(""+(char)(j+'a'));
        	}
        }
        return list;
    }
}