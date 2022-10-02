import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class MayinTarlasi {
    Scanner scan = new Scanner(System.in);
    int row;
    int col;
    int trap = 0;
    int open = 0;

    int[][] counter;
    boolean[][] mine;
    char[][] canvas;
    boolean isGameOver = false;


    MayinTarlasi(int row, int col) {
        this.row = row;
        this.col = col;

        counter = new int[row][col]; //count of the traps around the chosen location
        mine = new boolean[row][col]; //traps' places
        canvas = new char[row][col]; // visual

        for (int i = 0; i < row; i++) {
            Arrays.fill(mine[i], false);
        }

        for (int i = 0; i < row; i++) {
            Arrays.fill(counter[i], 0);
        }

        for (int i = 0; i < row; i++) {
            Arrays.fill(canvas[i], '-');
        }
        minePlaces(mine);
    }

    public void minePlaces(boolean[][] mine) {
        Random rand = new Random();
        while (trap <= row * col / 4) {
            int i = rand.nextInt(row);
            int j = rand.nextInt(col);
            if (!mine[i][j]) {
                trap++;
                mine[i][j] = true;
                for (int a = i - 1; a < i + 2; a++) {
                    for (int b = j - 1; b < j + 2; b++) {
                        try {
                            counter[a][b]++;
                        } catch (ArrayIndexOutOfBoundsException ignored) {//ignore//
                        }

                    }
                }

            }
        }


    }

    public void sweep(int r, int c) {
        r--;
        c--;
        if (mine[r][c]) {
            System.out.println("Game Over!!");
            isGameOver = true;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    canvas[i][j] = mine[i][j] ? '*' : canvas[i][j];
                }
            }
            printArea();
            return;
        }
        canvas[r][c] = (char) (counter[r][c] + 48);
        open++;

        isZero(r, c);

        if (open == row * col - trap) {
            isGameOver = true;
            System.out.println("Congratulations!!");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    canvas[i][j] = mine[i][j] ? '*' : canvas[i][j];
                }
            }
            printArea();
            return;
        }
        printArea();
    }

    private void isZero(int r, int c) {
        if (counter[r][c] == 0) {
            for (int i = r - 1; i <= r + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    try {
                        if (canvas[i][j] == '-') {
                            canvas[i][j] = (char) (counter[i][j] + 48);
                            open++;
                            if (counter[i][j] == 0)
                                isZero(i, j);
                        }

                    } catch (ArrayIndexOutOfBoundsException ignored) {
                        //ignore
                    }
                }
            }
        }

    }

    public void printArea() {
        for (char[] cArr : canvas) {
            for (char c : cArr) {
                System.out.printf("%-2s", c);
            }
            System.out.println();
        }

    }

}