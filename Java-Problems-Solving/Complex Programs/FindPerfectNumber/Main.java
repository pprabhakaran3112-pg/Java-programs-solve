import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,sum=0;
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter num :");
		n=in.nextInt();
		for(int i=1;i<=n/2;i++){
		    if(n%i==0){
		        System.out.print(i+",");
		        sum=sum+i;
		        	
		    }
		}
	
		if(sum==n)
		System.out.println("Are Perfect Number");
		else
		System.out.println("Are Not a Perfect Number");
	}
}
