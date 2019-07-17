/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        List<Interval>list=new ArrayList<>();
        int i=0,j=0,len1=A.length,len2=B.length;
        int left=0,right=0;
        while(i<len1&&j<len2){
        	left=Math.max(A[i].start,B[j].start);
        	if(A[i].end>=B[j].end){
        		right=B[j].end;
        		j++;
        	}else{
        		right=A[i].end;
        		i++;
        	}
        	if(left<=right){
        		list.add(new Interval(left,right));
        	}
        }
        Interval[] res=new Interval[list.size()];
        return list.toArray(res);
    }
}