//735.行星碰撞
class Solution {
  //只有当左边为正右边为负的时候才会碰撞
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s=new Stack();
        for(int i=0;i<asteroids.length;i++){
        	int t=asteroids[i];
        	while(!s.empty()&&t<0&&s.peek()>0){
        		int value=s.pop();
        		int k=Math.abs(t);
        		if(value>k) t=value;
        		else
        		if(value==k) t=0;
        	}
        	if(t!=0) s.push(t);
        }
        int[]res=new int[s.size()];
        int j=s.size()-1;
        while(s.size()>0){
        	res[j]=s.pop();
        	j--;
        }
        return res;
    }
}