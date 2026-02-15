import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter num: ");
		n=in.nextInt();
		int b=1;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(b+" ");
		        b++;
		    }
		System.out.println();
	}
	}
}
