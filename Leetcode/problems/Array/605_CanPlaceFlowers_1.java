class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        /*
        //判断连续0的个数嘛，再根据连续0的个数，判断这个区域能种多少花
        //如果0的连续个数n>2,那么这个地方就能种（n-1）/2朵花
        */
        int len=0;
        int sum=0;
        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0) 
            {
               sum++;
            //由于花不和边界抢水，所以我们可以在数组头尾设置0，表示边界，即[0,0,1,0,1]
            if(i==0) sum++;   
            if(i==flowerbed.length-1) sum++;
            }
            else{
                len+=(sum-1)/2;
                sum=0;
            }
        }
        len+=(sum-1)/2;
        if(len>=n)return true;
        else return false;
    }
}