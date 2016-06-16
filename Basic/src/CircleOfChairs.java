import java.util.Vector;

public class CircleOfChairs {
	
	public static void main(String[] args){
		
		System.out.println("survivor is: "+getSurvivor2(1500));
		
	}
	
	public static int getSurvivor(int n){
		long start = System.currentTimeMillis();
		Vector<Integer> chairs = new Vector<Integer>();
		for(int i=0; i<n; i++){
			chairs.add(i+1); // make value start from 1;
		}
		
		int cur = 0;
		int count = 0;
		while (chairs.size() > 1) {
			chairs.remove(cur);
		    cur = (cur+1+count)%chairs.size(); // get the index of next chair to removed
		    count++; // the number of chairs need to skip
		}
		long end = System.currentTimeMillis();
		System.out.println("it takes "+(end-start)+" ms");
		return chairs.get(0);
		
	}
	
	
	public static  int getSurvivor2(int n){
		
		long start = System.currentTimeMillis();
		int result = -1;
		if(n==1){
			result = 1;
		}
		else{
			int i=1, count=0;;
			boolean[] chairs = new boolean[n];
			for(int j=0;j<n;j++){
				
				if(!chairs[j]){
					count++;
				}
				if(count == i){
					chairs[j]=true;
					i++;
					count = 0;
					if(j==(n-1))
						j=-1;
					if(i==n){
						break;
					}
					
				}else if(j==(n-1) && count<i){
					j=-1;
					
				}
			}
			
			for(int j=0;j<n;j++){
				if(!chairs[j]){
					
					 result = j+1;
				}
					
			}
		}
		 long end = System.currentTimeMillis();
		 System.out.println("it takes "+(end-start)+" ms");
		return result;
		
	}
	
}
