import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,count=0;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter Number :");
		n=in.nextInt();
		while(n!=0){
		    int rem=n%10;
		    n/=10;
		    count++;
		}
		System.out.println(count);
	}
}
