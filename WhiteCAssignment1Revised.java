/* Change the following comments to the values for what they indicate:
 * Christopher Lewis White
 * CSCI 1302-01 Computer Science II
 * Assignment 1
 * Dr. Jillian Morgan 
 * 02-16-2020
*/

import java.util.Scanner; //This is for user input//
import java.util.Random; //needed to generate the random numbers//
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays; // import the Arrays 

public class WhiteCAssignment1Revised{
    public static void main(String[] args){
        // Don't forget to:
        Scanner input = new Scanner(System.in); //This is the Scanner Object//
        int sum = 0;
        
        // This code will generate the random 0s and 1s
        Random rand = new Random(); // creates a random number generator//
        
        // Get the size of the array from the user (this will be the # rows and columns)//
        System.out.println ("What would you the size of the array to be?");
        int userAnswer = input.nextInt(); // Gets user input and sets it to a variable//

        // Create a 2D array based on that size
        int[][] numbers = new int [userAnswer][userAnswer]; //This is an end by end 2D array that adapts to user input//
        // Fill it with random 0s and 1s (see below)
        // statement of outer loop initialization; condition; increment for the rows//
        // This the nested for loop for the rows//
         for (int row = 0; row < numbers.length; row++) {
            // statement of inside loop initialization; condition; increment for the columns//
           for (int column = 0; column < numbers[row].length; column++) {
           //The following line of code will generate a random integer between 0 and 1.
          // It needs to be used to store these values in the 2D array, 
         // so make sure that you put it in an appropriate place in the code to do so 
             numbers[row][column] = rand.nextInt(2);
           } 
           }//End of nested for loop for rows only//
           
            //Printing the 2D array//
            for (int rabbit = 0; rabbit < numbers.length; rabbit++) {
               for (int column = 0; column < numbers[rabbit].length; column++) { 
             System.out.print (numbers[rabbit][column] + "");
           
           }
           
            System.out.println();
           
           }//End of printing for the 2D array//
           
           
           
           
           
           
           
        // Create two parallel 1D Arrays
        int[] rowArray = new int[userAnswer];// 1D array for rows//
        int[] columnArray = new int[userAnswer];// 1D array for columns//
        
        
        for (int i = 0; i < numbers.length; i++) {
            // statement of inside loop initialization; condition; increment for the columns//
           for (int j = 0; j < numbers[i].length; j++) { 
             if(numbers[i][j]==1)
             {
               
               sum++; //increment by 1//
                rowArray[i] = sum;
             }
             
             
            }
             sum = 0;
            } 
           System.out.println(Arrays.toString(rowArray));
            
           System.out.println(" Which is the row is the highest?");
       
         int highestRow = 0;
          for (int i = 0; i < rowArray.length; i++){
            if(highestRow < rowArray[i]){
            highestRow = i;
            
            
            /*int highestRow = 0;
          for (int i = 1; i <= userAnswer; i++){
            if(highestRow < rowArray[i]){
            highestRow = rowArray[i];*/
            
         }
                }//End of highest row process//
                
        System.out.println("Row with the highest is:" + (Arrays.toString(rowArray)) + "\nNumber of 1's:" );
        //System.out.println("Row with the highest is:" + (Arrays.toString(rowArray)) + "\nNumber of 1's:" );         
         //System.out.println("Row with the highest is: " + highestRow + "\nNumber of 1's:" );
        int max = rowArray[0];
            if(max < rowArray[1]);
            
            
            //Compare Row Tallies for the highest frequency, store in rowMost ArrayList
    ArrayList<Integer> rowMost = new ArrayList<Integer>();
    rowMost.add(0);
    for(int tallyPrint = 0; tallyPrint<rowArray.length; tallyPrint++)
    {
      if (rowArray[tallyPrint] > rowArray[rowMost.get(0)])
      {
        rowMost.set(0, tallyPrint);
      }
    }

    //Compare Column Tallies for the highest frequency, store in colMost ArrayList
    ArrayList<Integer> colMost = new ArrayList<Integer>();
    colMost.add(0);
    for(int coltallyPrint = 0; coltallyPrint<columnArray.length; coltallyPrint++)
    {
      if (columnArray[coltallyPrint] > columnArray[colMost.get(0)])
      {
        colMost.set(0,coltallyPrint);
      }
    }
    
    //Output Row and Column with highest Frequency
    System.out.println("Row with Most: Row Tally["+rowMost.get(0)+"]: "+rowArray[rowMost.get(0)]);
    System.out.println("Col with Most: Col Tally["+colMost.get(0)+"]: "+columnArray[colMost.get(0)]);
  }
}//End of program//

            
            
            
            
            
            
            
            
            
            
          
        
             
        // Create two ArrayLists (these won't be parallel)
         //ArrayList<Integer> cars = new ArrayList<Integer>();
         //ArrayList.add();  
         //ArrayList.add();
         //arrayList.add();
         //System.out.println();
         
         //Second ArrayList//
         //ArrayList<Integer> otherList = new ArrayList<Integer>();
         //otherList.add("Triangle");
         //otherList.add("Circle");
         
         // Count the number of 1s in each row (or sum the row) and compare
        //int sum = 0;
            //for(int row = 0; row < numbers.length; row++){
                //for(int col = 0; col < numbers[0].length; col++){ 
                    //sum = sum + numbers[row][col];
                //}
               //}
              
             //for (int i = 0; i < numbers.length; i++)
               //{
             //for (int j = 0; j < numbers[i].length; j++)
             //{
             
               
             //}
            //}
        // Repeat for columns
        // store the highest rows (yes there could be multiple) and columns in their respective array lists
        // Repeat this for columns too
        // Output the results
        
        
   //}//End of main method//      
    
//}//End of program//


