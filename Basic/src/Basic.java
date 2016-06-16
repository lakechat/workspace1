import java.util.Vector;


public class Basic 
{
	public static synchronized void main(String[] args)

    {
		/*
		int i=  9;
		i = ++i;
		System.out.println(" i : "+i);
	
		
		i = i++;
		int j = i++;
		System.out.println(" i : "+i+", j: "+j);
        //System.out.println("Greeting String is "+Constants.greetingString);
		
		 String s =  "Computer" ;

		 if( s == "Computer")

		 System.out.println( "equal a ");

		 if( s.equals("Computer" ) )

		 System.out.println( "equal b ");
		 int[][] a = new int[4][];
		 a[0] = new int[4];
		 a[1] = new int[3];
		 a[2] = new int[2];
		 a[3] = new int[1];
		 System.out.println(" a: "+a.length);
		 for( int n = 0; n < 4; n++ )
			 System.out.println( a[n].length);
		 
		 int[] c = {1,2,3,4};
		 char[] ch = new char[5];
		 Basic basic = new Basic();
		 basic.assign(c);
		 System.out.println(b[1]+" "+c[1]);
		 System.out.println();
		 
		 int[] b = new int[4] ;
		 for(int ii=0;ii<4;ii++)
		 {
			 b[ii] = c[ii];
			 System.out.println(b[ii]);
		 }
		 System.out.println((b==c)?"ture":"false");
		 System.out.println(b.equals(c)?"true":"false");
		 basic.testNull();
		 */
		 /*
		 System.out.println("1"+Thread.activeCount());
		 Thread t = new ThreadTest();
		 System.out.println("2"+Thread.activeCount());
		 t.run();
		 System.out.println("3"+Thread.activeCount());
		 t=null;
		 System.out.println("4"+Thread.activeCount());
		 */
	/*	
		Thread t = new Thread() {
		      public void run() {
		        pong();
		      }
		    };

		    t.run();
		    System.out.println("Ping");
		  }

	*/
		String s1 = "A";
		
		String s2 = s1;
		String s3 = s2;
		
		System.out.println((s2 == s3)?true:false);
		System.out.println(" s2: "+s2+", s3: "+s3);
		
		int[] a = new int[0];
		System.out.println(a.equals(null)?true:false);
		
		
		int x = -1234;
		
		System.out.println(x%10);
		
		 }


   
	static int[] b;
	private void assign(int[] a)
	{
		b = a;
		
		System.out.println(b.equals(a)?"true":"false");
		b[1] = 3;
		System.out.println(b.equals(a)?"true":"false");
		
		
	}
	
	private void testNull()
	{
		String s1 = "abc";
		String s2 = s1;
		
		System.out.println(s1 == s2?"true":"false");
		System.out.println(s1.equals(s2)?"true":"false");
		
		s1 = null;
		System.out.println("After null");
		System.out.println(s2);
		System.out.println(s2.equals(s1)?"true":"false");
		System.out.println(s1 == s2?"true":"false");
	}
	 static synchronized void pong() {
		    System.out.println("Pong");
		  }
}
