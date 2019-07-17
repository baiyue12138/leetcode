class Solution {
    public int[][] kClosest(int[][] points, int K) { 
      int len=points.length;
      int[]point=new int[len];
      for(int i=0;i<len;i++){
        point[i]=dist(points[i]);
      }
      Arrays.sort(point);
      int distK=point[K-1];
      int[][] res=new int[K][2];
      int t=0;
      for(int i=0;i<len;i++){
        if(dist(points[i])<=distK)
        {
          res[t++]=points[i];
        }
      }
       return res;
    }
  int dist(int []points){
    return points[0]*points[0]+points[1]*points[1];
  }
}
