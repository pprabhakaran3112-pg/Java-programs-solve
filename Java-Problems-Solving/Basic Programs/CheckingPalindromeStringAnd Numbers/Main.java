import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter value: ");
        String a = in.nextLine().toLowerCase();

        String rev = new StringBuilder(a).reverse().toString();
        if (a.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        
    }
}
