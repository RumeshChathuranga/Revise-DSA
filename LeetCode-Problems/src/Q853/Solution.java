package Q853;

import java.util.Arrays;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n =  position.length;
        double[][] arr = new double[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = position[i];
            arr[i][1] = (double) (target - position[i]) / speed[i];
        }

        Arrays.sort( arr, (a,b) -> Double.compare(b[0],a[0]));

        int count = 0;
        double previous = 0;
        for(double[] d : arr) {
            if(d[1] > previous){
                count++;
                previous=d[1];
            }
        }
        return count;
    }
}