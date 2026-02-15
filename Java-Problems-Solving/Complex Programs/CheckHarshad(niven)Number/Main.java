import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n,sum=0;
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter number :");
		n=in.nextInt();
	int	temp=n;
      	while(temp!=0)
     	{
	     int rem=temp%10;
	      sum=sum+rem;
	     temp/=10;
	    }
	    System.out.println(sum);
	    int original=n;
	    if(original%sum==0){
	        System.out.println("harshad number");
	            
	        }else{
	            System.out.println("Not harshad number");
	        }
	    
	}
}