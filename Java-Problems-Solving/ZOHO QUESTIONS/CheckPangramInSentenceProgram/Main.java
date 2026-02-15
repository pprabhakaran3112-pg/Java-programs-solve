import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String s = in.nextLine().toLowerCase();

        boolean[] arr=new boolean[26];
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z') {
                arr[ch-'a']=true;
            }
        }
        boolean pan=true;
        for (int i=0;i<26;i++) {
            if (!arr[i]) {
                pan=false;
                break;
            }
        }
        if (pan) {
            System.out.println("pangram");
          } else {
            System.out.println("not pangram");
        }
    }
}



// USing Hashset 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String s = in.nextLine().toLowerCase();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        if (set.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}

