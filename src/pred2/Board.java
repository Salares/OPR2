package pred2;

import java.awt.*;

public class Board {
    private char[][] grid;
    public void updateBoard(Point newPoint) {
    }

    public void updateBoard(int x, int y, char newValue) {
        grid[x][y] = newValue;
    }

    public void printBoard() {

        for (char[] row : this.grid) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public boolean validateInsertPoint(int x, int y) {
        if(grid[x][y] == 'E') {
            return true;
        } else {
            return false;
        }
    }

    public char getPoint(int x, int y) {
        return grid[x][y];
    }
}

/*

0 1 2
3 4 5
6 7 8
 */
