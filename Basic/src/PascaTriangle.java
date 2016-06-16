
public class PascaTriangle {
	
	
	public static void main(String[] args){
		
		drawPasca(6);
	}
	
	public static void drawPasca(int n){
		
		int[][] a = new int[n][n];
		
		a[0][0] = 1;
		
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=i;j++){
				if(i==j || j==0)
					a[i][j]=1;
				else
					a[i][j] = a[i-1][j-1]+a[i-1][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
