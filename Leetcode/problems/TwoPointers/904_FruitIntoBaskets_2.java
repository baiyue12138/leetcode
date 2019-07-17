class Solution {
    public int totalFruit(int[] tree) {
        int b1=0;
        int b2=0;
        int max=0;
        int count=0;
        for(int i=0;i<tree.length;i++)
        {
            if(tree[i]==tree[b1]||tree[i]==tree[b2])
                count++;      
            else
            {
                if(b1!=b2)//这个地方说明要将双指针更换指向目标，重置count
                {
                    count=1;
                    b1=i-1;
                    while(tree[b1-1]==tree[i-1])
                    {
                         b1-=1;
                        count++;
                    }
                    b2=i;
                    count++;
                }   
                else//这个地方，是因为开始时b1,b2指向得都是下标0，也可以在开始之前使b1,b2指向两棵不同得树,所以这个地方不用充值count
                {
                    count++;
                    b2=i;
                }  
            }
             max=Math.max(max,count);
        }
        return max;
    }
}