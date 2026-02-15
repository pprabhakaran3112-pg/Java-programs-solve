import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Entter String");
		String s=in.nextLine();
    	int i,j;
		for(i=0;i<s.length();i++){
		    char ch=s.charAt(i);
		   int count=0;
		    for(j=0;j<s.length();j++){
		         if(s.charAt(j)==ch){
		           count++;  
		         }
		    }
     	if(count==1){
	    	System.out.print("first Non repeating character : "+ch);
	    	return;
	     }else{
	    	System.out.print("no repeating character");

         	}
		}
 }
}