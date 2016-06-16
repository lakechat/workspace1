package BigNumbers;

import java.math.*;
import java.text.*;
import java.util.*;
public class Mortgage2 {
   public static void main(String[] args) {
      BigDecimal payment = new BigDecimal("111589778678900.37");
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.JAPAN); 
      double doublePayment = payment.doubleValue();
      String s = n.format(doublePayment);
      System.out.println(s);
      
      
      BigDecimal a = new BigDecimal("2.5"); // digit left of 5 is even, so round down
      BigDecimal b = new BigDecimal("1.5"); // digit left of 5 is odd, so round up
      
       a.add(b);
      System.out.println(a.toString());
      
      int c = 2;
      System.out.format("%s",~c);
      
   }
}