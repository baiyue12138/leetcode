class Solution {
    public boolean isLongPressedName(String name, String typed) {
    //https://blog.csdn.net/qq_17550379/article/details/83270472
		int i=0,len=typed.length();//i指针
		for(int j=0;j<len;j++){
			if(i<name.length()&&name.charAt(i)==typed.charAt(j))
			{
				i++;
			}else{
				if(j<=0||typed.charAt(j)!=typed.charAt(j-1)){
					return false;
				}
			}
		}
		return i==name.length();
    }
}