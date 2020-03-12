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

public class WhiteCAssignment1{//It's conventional to start classes with a capital letter//
    public static void main(String[] args){
        // Don't forget to:
        Scanner input = new Scanner(System.in); //This is the Scanner Object//
        int i = 0; //Variable Declaration 
        int j = 0;
        int sum = i + j;
        
        // This code will generate the random 0s and 1s
        Random rand = new Random(); // creates a random number generator//
        
        // Get the size of the array from the user (this will be the # rows and columns)//
        System.out.println ("What would you the size of the array to be?");
        int userAnswer = input.nextInt(); // Gets user input and sets it to a variable//

        // Create a 2D array based on that size
        int[][] numbers = new int [userAnswer][userAnswer]; //This is an end by end array that adapts to user input//
        // Fill it with random 0s and 1s (see below)
        // statement of outer loop initialization; condition; increment for the rows//
         for (int row = 0; row < numbers.length; row++) {rand.nextInt(2);
            // statement of inside loop initialization; condition; increment for the columns//
           for (int column = 0; column < numbers[row].length; column++) { 
           }  
         }
        // Create two parallel 1D Arrays
        int[] row = new int[userAnswer];
        int[] column = new int[userAnswer];
        
        // Create two ArrayLists (these won't be parallel)
         ArrayList<String> cars = new ArrayList<String>();
         cars.add("Volvo");
         cars.add("BMW");
         cars.add("Ford");
         cars.add("Mazda");
         System.out.println(cars);
         
        // Print the 2D array
        for(int i = 0; i<numbers.length; i++)
        {
          for(int j = 0; j<numbers.length; j++)
            sum = sum + numbers[i];
          {
            System.out.print(numbers[i][j]);
          }
          System.out.println();
         }
        // Count the number of 1s in each row (or sum the row) and compare
        //int sum = 0;
            //for(int row = 0; row < numbers.length; row++){
                //for(int col = 0; col < numbers[0].length; col++){ 
                    //sum = sum + numbers[row][col];
                    
             sum = 0;
             for (i = 0; i < numbers.length; i++)
            {
             for (j = 0; j < numbers[i].length; j++)
             {}
        // Repeat for columns
        // store the highest rows (yes there could be multiple) and columns in their respective array lists
        // Repeat this for columns too
        // Output the results
        
        //The following line of code will generate a random integer between 0 and 1.
        // It needs to be used to store these values in the 2D array, 
        // so make sure that you put it in an appropriate place in the code to do so
        
    }
    
  }
}

