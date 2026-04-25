/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size()==0) {
            return true;
        }
        int[] startTimes = new int[intervals.size()];
        for (int i=0; i<intervals.size(); ++i) {
            startTimes[i] = intervals.get(i).start;
        }
        Arrays.sort(startTimes);
        for (int i=0;i<intervals.size();++i) {
            for(int j=i+1;j<intervals.size();++j) {
                if (startTimes[i] == intervals.get(j).start) {
                    Interval temp1 = intervals.get(j);
                    intervals.set(j, intervals.get(i));
                    intervals.set(i, temp1);
                }
            }
        }
        Interval temp = intervals.get(0);

        for (int i=1;i<intervals.size(); ++i) {
            if(temp.start >= intervals.get(i).start || temp.end > intervals.get(i).start) {
                return false;
            }
            else {
                temp = intervals.get(i);
            }
        }

        return true;
    }
}
