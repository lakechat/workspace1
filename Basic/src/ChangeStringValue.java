import java.lang.reflect.Field;

public class ChangeStringValue {
	
	public static void main(String args[]){
	    String a = "test213";
	   // String s = new String("test213");
	    String s = "test213";
	    try {
	        System.out.println(s);
	        System.out.println(a);
	        char[] value = (char[])getFieldValue(s, "value");
	        value[1] = 'a';
	        System.out.println(s);
	        System.out.println(a);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	static Object getFieldValue(String s,String fieldName) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
	    Object chars = null;
	    Field innerCharArray = String.class.getDeclaredField(fieldName);
	    innerCharArray.setAccessible(true);
	    chars = innerCharArray.get(s);
	    return chars;
	}

}
