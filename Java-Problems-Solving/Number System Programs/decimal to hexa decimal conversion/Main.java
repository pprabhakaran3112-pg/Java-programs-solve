import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    int n,rem;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter n");
		n=in.nextInt();
		String hex=" ";
		while(n>0)
		{
		    rem=n%16;
		    if(rem<10)
		    {
		    hex=rem+hex;
		    }
		    else if(rem>=10){
		        hex=(char)((rem-10)+'A')+hex;
		    }
		    n/=16;
		    
		}
		System.out.println(hex);
	}
}