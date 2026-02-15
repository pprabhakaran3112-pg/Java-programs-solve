import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int num;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter num");
		num=in.nextInt();
		for(int i=2;i<=num;i++){
		    if(isPrime(i))
		    {
		        System.out.print(i+",");
		    }
		}
	}
	public static boolean isPrime(int n ){
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
