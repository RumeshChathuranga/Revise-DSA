package Q57;

import java.util.LinkedList;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int newStart = newInterval[0];
        int newEnd = newInterval[1];
        int left = 0;
        int right = intervals.length ;
        LinkedList<int[]> output = new LinkedList<>();
        //1. Completely before newInterval
        while(left < right && newStart > intervals[left][0]){
            output.add(intervals[left]);
            left++;
        }
        int[] interval = new int[2];
        //2. Overlapping with newInterval
        if(output.isEmpty() || output.getLast()[1] < newStart) output.add(newInterval);
        else{
            interval = output.removeLast();
            interval[1] = Math.max(interval[1], newEnd);
            output.add(interval);
        }
        //3. Completely after newInterval
        while (left < right) {
            interval = intervals[left];
            left++;
            int start = interval[0] , end = interval[1];
            if(output.getLast()[1] < start) output.add(interval);
            else{
                interval = output.removeLast();
                interval[1] = Math.max(interval[1], end);
                output.add(interval);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}