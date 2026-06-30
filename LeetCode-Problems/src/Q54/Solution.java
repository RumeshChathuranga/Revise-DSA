package Q54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int visited = 101;
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = 0;

        int [][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        int currentDirection = 0, changedDirection = 0;

        List<Integer> ans = new ArrayList<>();
        ans.add(matrix[0][0]);
        matrix[0][0] = visited;

        while (changedDirection < 2){
            while(row + directions[currentDirection][0] >= 0 &&
                    row + directions[currentDirection][0] < rows &&
                    col + directions[currentDirection][1] >= 0 &&
                    col+ directions[currentDirection][1] < cols &&
                    matrix[row+directions[currentDirection][0]][col+directions[currentDirection][1]] != visited
            ){
                changedDirection = 0;
                row += directions[currentDirection][0];
                col += directions[currentDirection][1];

                ans.add(matrix[row][col]);
                matrix[row][col] = visited;
            }

            currentDirection = (currentDirection + 1) % 4;
            changedDirection++;
        }
        return ans;
    }
}