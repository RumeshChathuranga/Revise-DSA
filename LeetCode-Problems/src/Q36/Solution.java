package Q36;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] columns = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for (int i = 0; i < n; i++) {
            rows[i] = new HashSet<Character>(n);
            columns[i] = new HashSet<Character>(n);
            boxes[i] = new HashSet<Character>(n);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = board[i][j];

                if (c == '.') continue;

                if (rows[i].contains(c)) return false;
                rows[i].add(c);

                if (columns[j].contains(c)) return false;
                columns[j].add(c);

                int index = (i / 3) * 3 + (j / 3);
                if (boxes[index].contains(c)) return false;
                boxes[index].add(c);
            }
        }
        return true;

    }
}
