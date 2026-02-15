import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 int n;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		n=in.nextInt();
	
	int i,j;
	for(i=1;i<=n;i++){
		    for( j=1;j<=n;j++){
		      
		   if(i==1||i==n||j==1||j==n){
		        System.out.print("#");
		   }else{
		        System.out.print(" ");
		   }
	}
	    System.out.println(" ");
	}
	}
}
