import java.util.Hashtable;
import java.util.Map;

public class ClassBasic {
	
	public static void main(String[] args){
		
		Map<String,String> ht = new Hashtable<String,String>();
		
		
		
		System.out.println(ht instanceof Hashtable);
		System.out.println(ht.getClass().getName());
		
	}

}
