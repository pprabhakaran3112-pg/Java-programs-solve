import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		n=in.nextInt();
	
	
	for(int i=1;i<=n;i++){
		    for(int j=i;j<n;j++){
		        System.out.print(" ");
		    }
		   for(int k=1;k<(2*i)-i;k++){
		        System.out.print(k);
		    }
		
		        for(int l=i;l>=1;l--){
		        System.out.print(l);
		    }
		    
		System.out.println();
	}
	
	
	    
	    
	    
	}
}