/** The Person class represents a person with first name, 
  * last name, and a middle initial (optional).
  *
  * For making the middle initial optional, see the
  * {@link #Person(String, String)} overloaded constructor
  * which does not have a parameter for the middle initial
 */
 
// Points to remember
// 1. try to adhere to conventions
// 2. don't give your constructors empty bodies
// 3. classes are not defined inside the main method
// 4. PROGRAMMING == PATTERNS!!!

// class definitions are just a way to define a new data type (aka abstract data type)
public class Person{ // Note the upper-case first letter, why did I do this?
    // attributes
    private String last, first; //lastName, or lName, or firstName, etc.
    private char midInitial;
    //private Address home;
    
    //getters & setters
    //getter
    public String getLast(){ // thisIsCamelCase
        return this.last; //this is implied here, but it's okay to still type it
    }
    
    //setter
    public void setLast(String last){
        this.last = last; //this MUST be stated to avoid ambiguity
    }
    
    // constructor(s)
    /* This is
       a comment that can
       
       span multiple lines
    */
    
    /** Initialize a Person object with the given first, last and middle initial
       @param first first name of the Person
       @param last last name of the Person
       @param midInitial the middle initial of the Person    
     */
     //Person class Constructor 
     public Person(String first, String last, char midInitial){
        this.first = first;
        this.last = last;
        this.midInitial = midInitial;
     }
     
     /** Initialize a Person object with only the given first and last names.
         This makes the middle initial optional, keeping the person class flexible
         in case a person does not have a middle name.
         @param first Person's first name
         @param last Person's last name
       */
       public Person(String first, String last){
           this(first, last, '\u0000'); //this calls the matching constructor w/i this class
           // the '' just creates an empty char
           // CAN ALSO
           // this.last = last;
           // this.first = first;
       }
       
       
       
       //"special" toString method
       /** Return a string representation of a Person.
         * This representation is in the form of First MidInitial. Last
         * @return a string representation of a Person
       */
       
       //SI Adjustment
       public String toString(){
           return "First Name: " + first + "\tMiddle Initial: " + midInitial + "\tLast Name: " + last;
       }
       
       public boolean equals(Person other){
           // if(first.equals(other.first) && this.last.equals(other.last) && this.midInitial == other.midInitial){
//                return true;
//            }
//            else{
//                return false;
//            }
               
           return (first.equals(other.first) && this.last.equals(other.last) && this.midInitial == other.midInitial);
       }
       
       /** Copy Constructor.
         * Creates a new Person based on the Person passed as a parameter (otherPerson)
         * Assigns each attribute value from otherPerson to the current Person (this)        
        */
       public Person(Person otherPerson){
           //take attribute values from existing person (otherPerson)
           //assign them to the attributes for the new person (this)
           //objectToCreate.attribute = objectToCopy.attribute;
           this.first = otherPerson.first;
           this.last = otherPerson.last;
           this.midInitial = otherPerson.midInitial;
           
           //could also do it like this!
           //make existing constructor do the work for you
           //this(otherPerson.first, otherPerson.last, otherPerson.midInitial);
       }

     
}