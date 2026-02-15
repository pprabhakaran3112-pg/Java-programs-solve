import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter Number: ");
		n=in.nextInt();
		char ch='A';
		
		for(int i=1;i<=n;i++){
		    for(int j=i;j<n;j++){
		        System.out.print(" ");
		    }
		   for(int k=1;k<=i;k++){
		        System.out.print(ch);
		        ch++;
		    }
		    ch--;
		        for(int l=1;l<i;l++){
		            ch--;
		        System.out.print( ch);
		    }
		System.out.println(" ");
}
			for(int i=n-1;i>=1;i--){
		    for(int j=i;j<n;j++){
		        System.out.print(" ");
		    }
		   
		    for(int k=1;k<=i;k++){
		        System.out.print(ch);
		        ch++;
		    }
		    ch--;
		     for(int l=i-1;l>=1;l--){
		         ch--;
		        System.out.print(ch);
		        
		     }
		    System.out.println(" ");
		}
	}
}