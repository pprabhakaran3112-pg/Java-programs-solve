import java.util.Scanner;
class Main
    {
	public static void main(String[] args) {
	    int n;
	    Scanner in=new Scanner(System.in);
		System.out.println(" Enter num");
	 n=in.nextInt();
	 int[] a=new int[n];
     boolean[] v=new boolean[a.length];
     
     
      for (int i = 0; i <n; i++) {
          System.out.print("num :");
            a[i] = in.nextInt();
        }
        
        
        
     for(int i=0;i<a.length;i++){
         if(v[i]==true){
             continue;
         }
         int count=0;
         for(int j=0;j<a.length;j++){
             if(a[i]==a[j]){
                 count++;
                 v[j]=true;
             }
         }
         System.out.println(a[i]+"-"+count);
     }
	}

}

// the duplicates of the array that each duplicates is counted as frequnecy