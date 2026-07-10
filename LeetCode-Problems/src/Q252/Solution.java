package Q252;

//LeetCode 252 is Meeting Rooms (a Premium/Locked problem).
//
//Problem Statement
//
//You are given an array of meeting time intervals where each interval is represented as:
//
//        [start, end]
//
//Determine whether a person can attend all meetings.
//
//Example 1
//Input:
//        [[0,30],[5,10],[15,20]]
//
//Output:
//        false
//
//Explanation:
//
//Meeting [0,30] overlaps with [5,10].
//Example 2
//Input:
//        [[7,10],[2,4]]
//
//Output:
//        true
//
//Explanation:
//
//The meetings do not overlap.
//Constraints
//0 <= intervals.length <= 10^4
//intervals[i].length == 2
//        0 <= start < end <= 10^6

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public boolean canAttendMeeting(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        for(int i = 0; i < intervals.length-1;i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }

}
