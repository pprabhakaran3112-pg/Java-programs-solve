import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   
		int[] a={1,3,3,4,3,2,1,4,5,5,8,9};
		boolean[] v=new boolean[a.length];
		for(int i=0;i<a.length;i++){
		    if(v[i]==true){
		        continue;
		    }
		    boolean c1=false;
		    for(int j=i+1;j<a.length;j++){
		        if(a[i]==a[j]){
		         c1=true;
		         v[j]=true;
		        }
		    }
		   if(!c1){
            System.out.print(a[i]+",");		   }
		}
		  
	}
}