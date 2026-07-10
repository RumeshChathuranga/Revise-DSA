package Q253;

//LeetCode 253 is Meeting Rooms II (also a Premium/Locked problem).
//
//Problem Statement
//
//Given an array of meeting time intervals:
//
//intervals[i] = [starti, endi]
//
//Return the minimum number of conference rooms required to hold all the meetings.
//
//        Example 1
//Input:
//        [[0,30],[5,10],[15,20]]
//
//Output:
//        2
//
//Explanation:
//
//Room 1: [0,30]
//Room 2: [5,10] → [15,20]
//Example 2
//Input:
//        [[7,10],[2,4]]
//
//Output:
//        1
//
//Explanation:
//
//The meetings do not overlap, so one room is enough.
//
//Example 3
//Input:
//        [[1,5],[2,6],[4,8]]
//
//Output:
//        3
//Constraints
//1 <= intervals.length <= 10^4
//intervals[i].length == 2
//        0 <= start < end <= 10^6

import java.util.Arrays;

public class Solution {
    public int minMeetingRooms(int[][] intervals){
        if (intervals.length==0) return 0;
        int[] start = new  int[intervals.length];
        int[] end = new  int[intervals.length];

        for(int i=0;i<intervals.length;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int startptr = 0;
        int endptr = 0;

        int result = 0;

        while(startptr < start.length){
            if(start[startptr] >= end[endptr]){
                result--;
                endptr++;
            }
            result++;
            startptr++;
        }

        return result;
    }
}
