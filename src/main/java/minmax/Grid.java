package minmax;

import java.util.ArrayList;
import java.util.Random;

/** Creates a randomized 10 x 10 grid of numbers.
 *
 * @author Douglas Luman
 */
public class Grid {

  ArrayList<Integer> used = new ArrayList<Integer>();
  private int[][] grid = new int[10][10];
  private Random fill = new Random();
  
  /** Constructor.
   *
   */
  public Grid() {
    setup();
  }
  
  /** Set up the grid.
   *
   */
  private void setup() {
    for (int r = 0; r < this.grid.length; r++) {
      for (int c = 0; c < this.grid[r].length; c++) {
        this.grid[r][c] = seed();
      }
    }
  }
  
  /** Generates a unique random number to put into a space in the puzzle.
   *
   */
  private int seed() {
    int number;
    do {
      number = fill.nextInt(1000) + 1;
    } while(checkUsed(number));
    this.used.add(new Integer(number));
    return number;
  }
  
  /** Checks if number has already been used.
   *
   * @param number Number to check
   */
  private boolean checkUsed(int number){
    if(this.used.indexOf(number) > -1) {
      return true;
    }
    return false;
  }
  
  /** Retrieves the completed grid array.
   *
   */
  public int[][] getGrid() {
    return this.grid;
  }
  
  /** Creates a String representation of the grid.
   *
   */
  public String toString() {
    String display = "\t";
    for (int i = 0; i < this.grid.length; i++) {
      display += "C" + (i + 1) + "\t";
    }
    display += "\n\n";
    for (int r = 0; r < this.grid.length; r++) {
      display += "R" + (r+1) + "\t";
      for(int c = 0; c < this.grid[r].length; c++) {
        display += this.grid[r][c] + "\t";
      }
      display += "\n";
    }
    return display;
  }
}