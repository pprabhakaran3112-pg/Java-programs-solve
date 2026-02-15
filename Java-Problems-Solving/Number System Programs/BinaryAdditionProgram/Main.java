import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String s1,s2;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		s1=in.nextLine();
		System.out.println("Enter number");
		s2=in.nextLine();
	int n1=s1.length()-1;
	int n2=s2.length()-1;
	int num;
	int carry=0;
	String sum=" ";
	while(n1>=0||n2>=0||carry==1){
	    num=0;
	    if(n1>=0 && n2>=0){
	        num=(s1.charAt(n1)-'0')+(s2.charAt(n2)-'0')+carry;
	    }
	    else if(n1>=0){
	        num=(s1.charAt(n1)-'0')+carry;
	    }
	    else if(n2>=0){
	        num=(s2.charAt(n2)-'0')+carry;
	    }
	    else{
	        num=carry;
	    }
	    carry=num/2;
	    num=num%2;
	    sum=sum+num;
	    n1--;
	    n2--;
	}
	System.out.print(sum);
	
	
	}
}
