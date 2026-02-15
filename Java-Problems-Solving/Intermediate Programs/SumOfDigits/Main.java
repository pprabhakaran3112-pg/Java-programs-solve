
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,sum=0;
	    Scanner in=new Scanner(System.in);
	   
		System.out.print("Enter Number :");
		n=in.nextInt();
		while(n!=0){
		  int rem=n%10;
		    sum=sum+rem;
		    n/=10;
		    
		}
		System.out.println(sum);
	}
}