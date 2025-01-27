import java.util.Arrays;

public class Path_3 {
    public static void main(String[] args) {
        boolean[][] board ={
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] paath = new int[board.length][board[0].length];
        allPathPrint("",board,0,0,paath,1);
    }
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] paath, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            paath[r][c] = step;
           for(int[] arr : paath){
               System.out.println(Arrays.toString(arr));
           }
            System.out.println(p);
            System.out.println();
           return;
        }
        if (!maze[r][c]) {
            return;
        }
        // i am considering this block in my path
        maze[r][c] = false;
        paath[r][c] = step;

        if (r < maze.length - 1) {
            allPathPrint(p + 'D', maze, r + 1, c,paath, step + 1);
        }
        if (c < maze.length - 1) {
            allPathPrint(p + 'R', maze, r, c + 1,paath, step + 1);
        }
        if (r > 0) {
            allPathPrint(p + 'U', maze, r - 1, c,paath, step + 1);
        }
        if(c > 0) {
            allPathPrint(p + 'L', maze, r, c - 1,paath, step + 1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also removed the changes that were made by that function
        maze[r][c] = true;
        paath[r][c] = 0;
    }
}
