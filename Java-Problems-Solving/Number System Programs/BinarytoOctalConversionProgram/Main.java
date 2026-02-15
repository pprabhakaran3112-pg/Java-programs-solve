import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String bin;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter binary num");
		bin=in.nextLine();
		String octal=" ";
		int value;
		while(bin.length()%3!=0){
		    bin="0"+bin;
		}
		for(int i=0;i<bin.length();i=i+3){
		    value=0;
		    value+=(bin.charAt(i)-'0')*4;
		   value+=(bin.charAt(i+1)-'0')*2;
		   value+=(bin.charAt(i+2)-'0')*1;
		    octal=octal+value;
		}
		System.out.print(octal);
	}
}
