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
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> intervals1 = new ArrayList<>();
        if (intervals.size() == 0) {
            return intervals;
        }
        for (int i = 0; i < intervals.size(); i++) {
            for (int j = i+1; j < intervals.size(); j++) {
                if (intervals.get(i).start > intervals.get(j).start) {
                    Interval tem = intervals.get(i);
                    intervals.set(i,intervals.get(j));
                    intervals.set(j,tem);
                }
            }
        }
        int min = intervals.get(0).start;
        int max = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            //重叠即合并区间
            if (intervals.get(i).start <= max) {
                max = intervals.get(i).end > max ? intervals.get(i).end : max;
            } else {
                intervals1.add(new Interval(min,max));
                min = intervals.get(i).start;
                max = intervals.get(i).end;
            }
        }
        intervals1.add(new Interval(min,max));
        return intervals1;
    }
