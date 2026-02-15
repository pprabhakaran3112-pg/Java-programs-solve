import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int n;
	   int sum=0;
		System.out.print("Enter Num : ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int temp=n;
		while(temp>0){
		    int digit=temp%10;
		    int fact=1;
		for(int i=1;i<=digit;i++){
		    fact=fact*i;
		}
		sum=sum+fact;
		 temp/=10;
		}
		if(sum==n){
		    System.out.println("Strong Number");
		}else{
		    System.out.println("Not Strong");
		}
		
	}
}
