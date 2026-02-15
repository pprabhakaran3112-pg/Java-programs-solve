import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.nextLine();
	   String result="";
	   char space=' ';
	    String temp="";
		for(int i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		    if(ch!=space){
		         temp+=ch;
		         
		    }
		    else{
		     String  rev="";
		     for(int j=temp.length()-1;j>=0;j--){
		         rev=rev+temp.charAt(j);
		       }
		     result=result+rev+" ";
		     temp="";
		    }
		}
		    String  rev="";
		     for(int j=temp.length()-1;j>=0;j--){
		         rev=rev+temp.charAt(j);
		     }
		     result=result+rev;
		     System.out.print("result is :"+result);
	}
}
