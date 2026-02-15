import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int dec,rem;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		dec=in.nextInt();
		String hex=" ";
		while(dec>0){
		     rem=dec%16;
		    if(rem<10){
		        hex=rem+hex;
		        
		    }
		       else if(rem>=10){
		           hex=(char)((rem-10)+'A')+hex;
		    }
		    dec=dec/16;
		}
		System.out.println(hex);
		
	}
}
