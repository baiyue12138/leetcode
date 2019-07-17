class Solution {
    //每次只需要保存上一层的数，不需要保存所有行的数据，还有个特性是对称，所以不需要再倒序排列
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            if(i==0) list.add(1);
            if(i==1) 
            {
                list.add(1);
            }
            if(i>=2){
                for(int k=list.size()-1;k>0;k--){                   
                        list.set(k,list.get(k-1)+list.get(k));                  
                }
                list.add(1);
            } 
        }
        return list;
    }
}