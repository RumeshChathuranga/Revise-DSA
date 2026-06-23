package Q2013;

import java.util.HashMap;
import java.util.Map;

class DetectSquares {
    private Map<Integer,Map<Integer,Integer>> pointsCount;
    public DetectSquares() {
        pointsCount = new HashMap<>();
    }

    public void add(int[] point) {
        int x =  point[0];
        int y = point[1];
        pointsCount.putIfAbsent(x,new HashMap<>());
        pointsCount.get(x).put(y, pointsCount.get(x).getOrDefault(y,0)+1);
    }

    public int count(int[] point) {
        int x1 =  point[0], y1 = point[1];
        int squares = 0;

        if(!pointsCount.containsKey(x1)) return 0;

        for(Map.Entry<Integer,Integer> entry: pointsCount.get(x1).entrySet()) {
            int y2 = entry.getKey();
            int count = entry.getValue();

            if(y1==y2) continue;

            int length = Math.abs(y1-y2);

            squares += countSquares(y1,x1+length, y2, count);
            squares += countSquares(y1,x1-length,y2,count);

        }
        return squares;
    }

    private int countSquares( int y1, int x3, int y2, int count){
        if(pointsCount.containsKey(x3)){
            Map<Integer,Integer> points = pointsCount.get(x3);
            return points.getOrDefault(y1,0)* points.getOrDefault(y2,0)*count;
        }
        return 0;

    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */