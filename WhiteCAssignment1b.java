/*Christopher Lewis White
 * CSCI 1302-01 Computer Science II
 * Assignment 1
 * Dr. Jillian Morgan 
 * 02-16-2020
*/

import java.util.Scanner;//This is for user input//
import java.util.ArrayList;//needed to generate the random numbers//
import java.util.Random;//needed to generate the random numbers//

public class WhiteCAssignment1b
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in); //Input Scanner
    Random rand = new Random(); //Random Number Generator

    System.out.print("2D Array Dimension: "); //Create nxn matrix, based on user input for dimension
    int array_size = input.nextInt();
    int[][] grid = new int[array_size][array_size];

    for(int row = 0; row<array_size;row++)  //populate 2D array with random 0s and 1s
    {
      for (int col = 0; col<array_size;col++)
      {
        grid[row][col] = rand.nextInt(2);
      }
    }

    for(int rowprint = 0; rowprint<array_size;rowprint++) //Output the 2D Array
    {
      for (int colprint = 0; colprint<array_size;colprint++)
      {
        System.out.print(grid[rowprint][colprint] + " ");
      }
      System.out.println("");
    }
    
    //Tally frequency of 1s per row, store in rowTally array
    int[] rowTally = new int[array_size];
    for (int rowT = 0; rowT<array_size; rowT++)
    {
        for(int colT = 0; colT<array_size; colT++)
        {
          rowTally[rowT] += grid[rowT][colT];
        }
    }
    //Tally frequency of 1s per column, store in colTally array
    int[] colTally = new int[array_size];
    for (int colTal = 0; colTal<array_size; colTal++)
    {
        for(int rowTal = 0; rowTal<array_size; rowTal++)
        {
          colTally[colTal] += grid[rowTal][colTal];
        }
    }

    //Compare Row Tallies for the highest frequency, store in rowMost ArrayList
    ArrayList<Integer> rowMost = new ArrayList<Integer>();
    rowMost.add(0);
    for(int tallyPrint = 0; tallyPrint<rowTally.length; tallyPrint++)
    {
      if (rowTally[tallyPrint] > rowTally[rowMost.get(0)])
      {
        rowMost.set(0, tallyPrint);
      }
    }

    //Compare Column Tallies for the highest frequency, store in colMost ArrayList
    ArrayList<Integer> colMost = new ArrayList<Integer>();
    colMost.add(0);
    for(int coltallyPrint = 0; coltallyPrint<rowTally.length; coltallyPrint++)
    {
      if (colTally[coltallyPrint] > colTally[colMost.get(0)])
      {
        colMost.set(0,coltallyPrint);
      }
    }

    //Output Row and Column with highest Frequency
    System.out.println("Row with Most: Row Tally["+rowMost.get(0)+"]: "+rowTally[rowMost.get(0)]);
    System.out.println("Col with Most: Col Tally["+colMost.get(0)+"]: "+colTally[colMost.get(0)]);
  }
}//End of program//
