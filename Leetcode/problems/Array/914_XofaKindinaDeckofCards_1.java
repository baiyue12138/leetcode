class Solution {
    //实质是求最大公约数
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int k:deck) map.put(k,map.getOrDefault(k,0)+1);
        int res=0;
        for(int value:map.values()) res=countNum(value,res);
        return res>1;
        
    }
    int countNum(int value,int res){//辗转相除法
        return res>0?countNum(res,value%res):value;
    }
}