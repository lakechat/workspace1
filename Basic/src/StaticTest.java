/* Java program to show that if static method is redefined by
   a derived class, then it is not overriding. */
 
// Superclass
class Parent {
     
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
class Child extends Parent {
     
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
public class StaticTest {
    public static void main(String args[ ])  {
       Parent obj1 = new Child();
        
       // As per overriding rules this should call to class Derive's static 
       // overridden method. Since static method can not be overridden, it 
       // calls Base's display() 
       obj1.display();  
        
       // Here overriding works and Derive's print() is called 
       obj1.print();   
       
       
       String s = "12345 6567";
       StringBuilder s2 = new StringBuilder(s).reverse();
       System.out.format("%s\n",s2.toString());
      char[] s3 = s.toCharArray();
      int length = s.length();
       for(int i =0; i<length/2;i++){
    	   char tmp = s3[i];
    	   s3[i] = s3[length-i-1];
    	   s3[length-i-1]=tmp;
       }
       
       System.out.format("%s\n",String.valueOf(s3));
    }
}