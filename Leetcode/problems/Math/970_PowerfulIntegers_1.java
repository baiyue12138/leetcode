class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer>list=new ArrayList<>();
        if(bound<2) return list;
        int I=0;
        int J=0;
        if(x>1)
        	while(Math.pow(x,I++)<bound);
        else
        	I=1;
        if(y>1)
        	while(Math.pow(y,J++)<bound);
        else
        	J=1;
        for(int i=0;i<I;i++){
        	for(int j=0;j<J;j++){
        		int tem=(int)(Math.pow(x,i)+Math.pow(y,j));
        		if(tem<=bound&&!list.contains(tem)){
        			list.add(tem);
        		}
        	}
        }
        return list;
    }
}