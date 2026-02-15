import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n=0,sum=0,digits=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number :");
		n=in.nextInt();
	int	temp=n;
		while(temp!=0){
		    temp=temp/10;
		    digits++;
		}
		temp=n;
		while(temp!=0){
		    int rem=temp%10;
		    sum+=Math.pow(rem,digits);
		    temp=temp/10;
		    	
		}
		if(sum==n){
		    System.out.println("Given No is Armstrong");
		}else{
		    	System.out.println("Its Not a Armstrong");
		}

	}
}
