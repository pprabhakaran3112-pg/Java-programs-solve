import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
            
           System.out.println("enter 1 : ");
           int r=in.nextInt();
           System.out.println("enter 2 : ");
            int c=in.nextInt();
           int i,j,max=0,row=0;
			int[][] a=new int[r][c];
		
			for(i=0;i<r;i++){
			    int sum=0;
			    for(j=0;j<c;j++){
			        a[i][j]=in.nextInt();
			          sum+=a[i][j];
			    }
			
			if(sum>max){
			   max=sum;
			    row=i;
			       }
	}
		      System.out.print((row+1)+" maximum  "+":");
			    for(j=0;j<c;j++){
			      System.out.print(a[row][j]+" ");
			       }
				
	}
}