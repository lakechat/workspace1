
public class StringSplit {
	
	public static void main(String[] args){
		
		String s = "1,2,3, , ";
		split2(s);
		
		Integer x = 400, y = 400;
        if (x == y)
           System.out.println("Same");
        else
           System.out.println("Not Same");
        
        Integer x2 = 40, y2 = 40;
        if (x2 == y2)
           System.out.println("Same");
        else
           System.out.println("Not Same");
        
        /*
         * In Java, values from -128 to 127 are cached, so the same objects are returned. The implementation of valueOf() uses cached objects if the value is between -128 to 127.
         */
	}
	
	public static void split1(String s){
		
		String[] t = s.split(",");
		
		System.out.format(" array size is: %d\n",t.length);
		for(String s1 : t)
			System.out.format("%s\n",s1);
	}
	
public static void split2(String s){
		
		//String[] t = s.split("\\D+");
		String[] t = s.split("\\D");
		
		System.out.format(" array size is: %d\n",t.length);
		for(String s1 : t)
			System.out.format("%s\n",s1);
	}

}
