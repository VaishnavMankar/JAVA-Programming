public class Solution {
    public static void main(String[] args) {

    }
  public int solution(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int maxSize = 1; // Every 1x1 square is magic

    // Check for squares starting from each cell
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        // Calculate maximum possible size based on remaining rows and columns
        int maxPossibleSize = Math.min(N - i, M - j);

        // Check for squares of all possible sizes starting from this cell
        for (int size = 1; size <= maxPossibleSize; size++) {
          if (isMagicSquare(A, i, j, size)) {
            maxSize = Math.max(maxSize, size);
            break; // No need to check larger squares from this cell
          }
        }
      }
    }

    return maxSize;
  }

  private boolean isMagicSquare(int[][] A, int row, int col, int size) {
    int sum = calculateSum(A, row, col, size);

    // Check row sums
    for (int i = row; i < row + size; i++) {
      if (calculateSum(A, i, col, 1) != sum) {
        return false;
      }
    }

    // Check column sums
    for (int j = col; j < col + size; j++) {
      if (calculateSum(A, row, j, 1) != sum) {
        return false;
      }
    }

    // Check diagonal sums (top-left to bottom-right and vice versa)
    if (calculateSum(A, row, col, size) != sum ||
        calculateSum(A, row + size - 1, col, size) != sum) {
      return false;
    }

    return true;
  }

  private int calculateSum(int[][] A, int row, int col, int size) {
    int sum = 0;
    for (int i = row; i < row + size; i++) {
      for (int j = col; j < col + size; j++) {
        sum += A[i][j];
      }
    }
    return sum;
  }
}