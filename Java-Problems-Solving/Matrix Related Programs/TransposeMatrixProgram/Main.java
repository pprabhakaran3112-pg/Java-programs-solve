import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
            
           System.out.println("enter 1 : ");
           int r=in.nextInt();
           System.out.println("enter 2 : ");
            int c=in.nextInt();
           int i,j;
			int[][] a=new int[r][c];
			int[][] transpose=new int[c][r];
			
			for(i=0;i<r;i++){
			    for(j=0;j<c;j++){
			        a[i][j]=in.nextInt();
			         transpose[j][i]=a[i][j];
			        
			    }
			}
			
			for(j=0;j<c;j++){
			 for(i=0;i<r;i++){
			   	System.out.print(transpose[i][j]+" ");
		
			    }
			      System.out.println();
			    
				}
				
	}
}