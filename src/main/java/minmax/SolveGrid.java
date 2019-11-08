package minmax;

/** Initializes and solves any random grid.
 *
 * @author Douglas Luman
 */
public class SolveGrid {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Grid grid = new Grid();
    System.out.println(grid);
    int[][] board = grid.getGrid();
    //-----------------------------
    int row = 0;
    int col = 0;
    int max = board[0][0];
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        if (board[r][c] > max) {
          row = r;
          col = c;
          max = board[r][c];
        }
      }
    }
    System.out.println("Maximum value " + max 
                       + " found at R" + (row + 1) 
                       + " C" + (col + 1));
    //-----------------------------
    int min = board[0][0];
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[r].length; c++) {
        if(board[r][c] < min) {
          row = r;
          col = c;
          min=board[r][c];
      }
    }
  }
  System.out.println("Minimum value " + min 
                     + " found at R" + (row + 1) 
                     + " C" + (col + 1));
  }
}