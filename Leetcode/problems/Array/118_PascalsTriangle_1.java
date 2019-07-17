class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allList=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>list=new ArrayList<>();
            if(i==0) list.add(1);
            if(i==1) 
            {
              list.add(1);
                list.add(1);
            }
            if(i>=2){
               List<Integer>list2=allList.get(i-1);
                for(int k=0;k<i;k++){
                    if (k==0) list.add(1);
                    else{
                        list.add(list2.get(k-1)+list2.get(k));
                    }
                }
                list.add(1);
            }
            allList.add(list);
        }
        return allList;
    }
}