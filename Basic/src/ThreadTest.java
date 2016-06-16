
public class ThreadTest extends Thread
{
	public void run()
	{
		try
		{
		Thread.sleep(5000);
		System.out.println(" print");
		}
		catch(Exception e){System.out.println(e.toString());}
	}
}
