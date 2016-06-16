/* Java program to show that if static method is redefined by
   a derived class, then it is not overriding. */
 
// Superclass
class Base2 {
     
    // Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class 
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
// Subclass
class Derived extends Base2 {
     
    // This method hides display() in Base 
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
     
    // This method overrides print() in Base 
    public void print() {
         System.out.println("Non-static or Instance method from Derived");
   }
}
 
// Driver class
public class Inheritance {
    public static void main(String args[ ])  {
       Base2 obj1 = new Derived(); // decided at compile time. by the reference, not the object
       
       Derived obj2 = new Derived();
        
       // As per overriding rules this should call to class Derive's static 
       // overridden method. Since static method can not be overridden, it 
       // calls Base's display() 
       obj1.display();  
       
       obj2.display();  
        
       // Here overriding works and Derive's print() is called 
       obj1.print();     
    }
}