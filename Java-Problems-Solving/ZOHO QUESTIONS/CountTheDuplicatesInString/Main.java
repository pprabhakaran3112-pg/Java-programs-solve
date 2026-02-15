import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=in.nextLine();
		String result="";
		int count=1;
	
		for(int i=0;i<s.length();i++){
		  if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
		        count++;
		 }
		 else{
		     result=result+s.charAt(i)+count;
		     count=1;
		 }
		 
        }
        System.out.print("compresses String: "+result);
      }  

	}
