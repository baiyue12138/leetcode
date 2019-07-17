class Solution {
//思路：我们可以发现，如果某个兔子回答的数字是x，那么说明森林里共有x+1个相同颜色的兔子，我们最多允许x+1个兔子同时回答x个，一旦超过了x+1个兔子，那么就得再增加了x+1个新兔子了。所以我们可以使用一个HashMap来建立某种颜色兔子的总个数和在数组中还允许出现的个数之间的映射，然后我们遍历数组中的每个兔子，如果该兔子回答了x个，若该颜色兔子的总个数x+1不在HashMap中，或者映射为0了，我们将这x+1个兔子加入结果res中，然后将其映射值设为x，表示在数组中还允许出现x个也回答x的兔子；否则的话，将映射值自减1即可，
    public int numRabbits(int[] answers) {
        if(answers.length==0)
            return 0;
        Map<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int a = 0;
        for(int i = 0; i < answers.length ; i ++){
            a = answers[i];
            if(a==0){
                res = res + a + 1;
            }else if(map.containsKey(a)&&map.get(a)<(a+1)){
                map.put(a,map.get(a)+1);
            }else if(map.containsKey(a)&&map.get(a)>=(a+1)){
                map.put(a,1);
                res = res + a + 1;
            }else{
                map.put(a,1);
                res = res + a + 1;
            }
        }
        return res;
    }
}