class Solution {
    public String countAndSay(int n) {
        if(n==1){
				return "1";
			}
		String res=countAndSay(n-1);
		StringBuilder sb=new StringBuilder();
		Character c=null;
		int num=0;
		for(int i=0;i<res.length();i++){
			if(c==null){
				c=res.charAt(i);
				num++;
			}else{
				if(c==res.charAt(i)){
					num++;
				}else{
					sb.append(num).append(c);
					num=1;
					c=res.charAt(i);
				}
			}
		}
		if(num>0){
			sb.append(num).append(c);
		}
		return sb.toString();
    }
}