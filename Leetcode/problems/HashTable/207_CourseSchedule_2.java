class Solution {
//使用拓扑排序
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int count=0;//用于统计拓扑序列的长度
        int[]in=new int[numCourses];
        Queue<Integer>queue=new LinkedList();
        //1.统计所有定点的入度(依赖的课程数)
        for(int i=0;i< prerequisites.length;i++){
        	in[ prerequisites[i][0] ]++;
        }
        //2.将节点入度为0的节点入队列
        for(int i=0;i<numCourses;i++){
        	if(in[i]==0) queue.offer(i);
        }
        //3.将与队列中节点相关联的边去掉，并且如果去掉边之后节点的入度==0，则入队列
        while(!queue.isEmpty()){
        	int cour=queue.poll();
        	count++;
        	for(int i=0;i< prerequisites.length;i++){
        		if(prerequisites[i][1]==cour) {
        			in[ prerequisites[i][0] ]--;
        			if(in[ prerequisites[i][0] ]==0){
        				queue.offer(prerequisites[i][0]);
        			}
        		}	
        	}
        }
        return count==numCourses;
    }
}