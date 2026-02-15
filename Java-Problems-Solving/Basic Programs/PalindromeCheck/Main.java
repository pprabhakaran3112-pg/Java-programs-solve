import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    int rev=0;
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=in.nextInt();
		int temp=n;
		while(temp!=0){
		    rev=rev*10+temp%10;
		    temp/=10;
		}
		if(n==rev){
		  System.out.println("Palindrome");
		  
		}else{
		     System.out.println("Not a Palindrome");
		}
		
	}
}
