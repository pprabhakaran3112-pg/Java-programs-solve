import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int dec,rem;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number:");
		dec=in.nextInt();
		String bina=" ";
		while(dec>0){
		     rem=dec%2;
		    if(rem<10){
		        bina=rem+bina;
		        
		    }
		       else if(rem>=10){
		           bina=(char)((rem-10)+'A')+bina;
		    }
		    dec=dec/2;
		}
		System.out.println(bina);
		
	}
}
