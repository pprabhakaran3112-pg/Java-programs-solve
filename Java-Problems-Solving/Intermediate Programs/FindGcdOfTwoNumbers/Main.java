import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int temp;
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter value 1 :");
		int a=in.nextInt();
		System.out.print("Enter value 2 :");
		int b=in.nextInt();
		while(b!=0){
           temp=b;
           b=a%b;
           a=temp;
		    
		}
		System.out.println(a);
	}
}
