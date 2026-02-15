import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String hexa=" ";
	    int num;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter num: ");
		hexa=in.nextLine();
		char value=' ';
		for(int i=0;i<hexa.length();i++){
		    value=hexa.charAt(i);
		    value = Character.toUpperCase(value);

		    if(value>='0'&& value<='9'){
		       num=value-'0';
		        
		    }
	    	  else if (value >= 'A' && value <= 'F') {
                num = (value - 'A') + 10;
             }
             else {
              System.out.print("Invalid ");
                return;
                }


		    String binary=Integer.toBinaryString(num);
		    while(binary.length() < 4){
		        binary="0"+binary;
		        	
		    }
		    System.out.print(binary);
		       
		}

		
	}
}