import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n, maxDigit = 0;
	    Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		n = in.nextInt();
		
		while(n > 0) {
		    int digit = n % 10;
		    if(digit > maxDigit) {
		        maxDigit = digit;
		    }
		    
		    n = n / 10;
		}
		System.out.println("Largest digit is: " + maxDigit);
	}
}
