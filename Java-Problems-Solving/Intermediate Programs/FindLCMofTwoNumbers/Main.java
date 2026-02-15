import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n,temp,lcm;
	    Scanner in=new Scanner(System.in);
		System.out.print("enter 1: ");
		int a=in.nextInt();
		System.out.print("Enter 2: ");
		int b=in.nextInt();
		int n1=a,n2=b;
		while(b!=0){
		    temp=b;
		    b=a%b;
		    a=temp;
		    
		}
		int gcd=a;
		lcm=(n1*n2)/gcd;
	    System.out.println(lcm);
	}
}
