import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n,n1=0,n2=1;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
		    System.out.print(n1+",");
		    int n3=n1+n2;
		    n1=n2;
		    n2=n3;
		    
		}
	}
}