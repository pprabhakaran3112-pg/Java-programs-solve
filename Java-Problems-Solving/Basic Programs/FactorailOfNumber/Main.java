import java.util.Scanner;

    class Main {
    public static void main(String[] args) {
       int n;
       Scanner in=new Scanner(System.in);
       System.out.print("Enter number:");
       n=in.nextInt();
      int fact=1;
      for(int i=1;i<=n;i++){
          fact=fact*i;
         
      }
        System.out.println(fact);
    }
}
