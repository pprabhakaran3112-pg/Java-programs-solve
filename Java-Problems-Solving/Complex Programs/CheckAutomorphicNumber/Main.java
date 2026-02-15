import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int n1 = n * n;   
        int temp = n;     
        while (temp > 0) {
            int a = n1 % 10;   
            int Sqr = temp % 10;   
            if (a != Sqr) {
                System.out.println("Not Automorphic");
                return;
            }
            n1 /= 10;
            temp /= 10; 
        }
        System.out.println("Automorphic Number");
       
    }
}
