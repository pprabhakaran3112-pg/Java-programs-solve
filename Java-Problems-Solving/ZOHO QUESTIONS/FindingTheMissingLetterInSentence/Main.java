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
        for(int i=0;i<26;i++){
            if(arr[i]==false){
             char missing=(char)('a'+i);
             System.out.print("missing is: "+missing);
             break;
            }
            
        }
       
    }
}
