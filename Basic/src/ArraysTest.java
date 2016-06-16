import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {
	
	public static void main (String[] args) 
    {
       
        
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(1);
        listTest(list,2);
        listTest(list,3);
        listTest(list,4);
    }
	
	public static void listTest(List<Integer> a, int n){
		
	}
	
	public static void arrayTest(){
		 int arr1[] = {1, 2, 3};
	        int arr2[] = {1, 2, 3};
	        if (arr1 == arr2) 
	            System.out.println("Same");
	        else
	            System.out.println("Not same");
	        
	        if (arr1.equals(arr2)) 
	            System.out.println("Same");
	        else
	            System.out.println("Not same");
	        
	        if (Arrays.equals(arr1, arr2))
	            System.out.println("Same");
	        else
	            System.out.println("Not same");
	}

}
