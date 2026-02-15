import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int num,sum=0;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=in.nextInt();
	int sqr=num*num;
	while(sqr>0){
	    int digits=sqr%10;
	    sum=sum+digits;
	    sqr/=10;
	}
	if(sum==num){
	    System.out.println("Neon Number");
	}else{
	    System.out.println("not Neon Number");
	}
	}
}
