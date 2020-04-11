/** Christopher Lewis White
  * CSCI 1302-01 Computer Science II
  * Triangle class online lecture Assignmnent (Abstract Classes & Methods + Interfaces)
  * Dr. Jillian Morgan
  * 4-10-2020

  ALORITHYM / INSTRUCTIONS:
  * Write a Triangle class that inherits from the Shape class that we wrote in class tonight (see the April 08 notes/video). 
  * Triangles have a base and a height and the formula to calculate their area is: 1/2 base * height.
  * To test it, use the ShapePlayground class that we wrote in class tonight (also in the April 08 notes).
  *   
 */
 
class Triangle extends Shape{
/**Attributes*/
private double base;
private double height;
/**private double Base, Height; - This is an alternartive way to list 'Attributes.'*/

public Triangle(double base, double height, String name, String color) {/**This is the start of the Constructor*/
        super(color, name);
        this.base =  base;
        this.height = height;
        }/**End of Constructor for Triangle class*/

public double getArea(){/**This Calculates and returns the area of Triangle*/
        //return (getHeight() * getWidth()) / 2;
     return 0.5 * base * height;
    }
 }//End of Triangle class
 
 public abstract class Shape{//Start of Abstract class aka. 'Superclass'
//Attribuites
private String name, color;
//Constuctor
public Shape(String name, String color){
      this.name = name;
      this.color = color;
      }

public String toString(){
   return "I am a " + color + " " + name; 
   }


public abstract double getArea();
}//End of Abstract class
 
 //**NOTE: CLASSES MUST BE IN THE SAME FOLDER IN ORDER FOR THEM TO COMPILE*/
 
