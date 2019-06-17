/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

/**
 *
 * @author aaronyang
 */
public class Percolation {
    
    int[][] board;
    
    int currentSite;
    int north;
    int east;
    int west;
    int south;
    
    int width;
    
    int countOpen = 0;
    
   public Percolation(int n) throws IllegalArgumentException                // create n-by-n grid, with all sites blocked
   {
       if(n <= 0)
           throw new IllegalArgumentException("The input must be greater than 0.");
       
       board = new int[n][n];
       width = n;

   }
   
   public void open(int row, int col)       // open site (row, col) if it is not open already
   {
       board[row][col] = 1;
   }
   
   public boolean isOpen(int row, int col)  // is site (row, col) open?
   {
       return board[row][col] == 1;
   }
   
   public boolean isFull(int row, int col)  // is site (row, col) full?
   {
       return board[row][col] == 2;
   }
   
   public int numberOfOpenSites()           // number of open sites
   {
       return countOpen++;
   }
   
   public boolean percolates()              // does the system percolate?
   {
       for(int i = 0; i < width; i++)
           for(int j = 0; j < width; j++)
               if(connected(board[0][i], board[width - 1][j])){
                   return true;
               }
       return false;
   }
   
   private boolean connected(int a, int b){
       return false;
   }

   public static void main(String[] args)   // test client (optional)
   {
       
   }
   
}
