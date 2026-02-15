import java.util.Scanner;

class Main{
    public static String deciToHex(int dec){
        int rem;
        String hex="";
        while(dec>0){
            rem=dec%16;
            if(rem<10){
                hex=rem+hex;
            }else if(rem>=10){
                hex=(char)((rem-10)+'A')+hex;
            }
            dec/=16;
        }
        return hex;
    }
    
    
    public static int hexToDeci(String hex){
        int decimal=0,power=0;
        
        for(int i=hex.length()-1;i>=0;i--){
            char ch=hex.charAt(i);
            int value;
            if(ch>='0' && ch<='9'){
                value=ch-'0';
            }else{
                value=ch-'A'+10;
            }
            decimal+=value*Math.pow(16,power);
            power++;
        }
        return decimal;
        
    }
    
    
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter: ");
        int num1=in.nextInt();
        System.out.print("Enter: ");
        int num2=in.nextInt();
        
        String hex1=deciToHex(num1);
        String hex2=deciToHex(num2);
        System.out.println("hex value: "+hex1);
        System.out.println("hex value: "+hex2);
        
        int deci1=hexToDeci(hex1);
        int deci2=hexToDeci(hex2);
        int sum=deci1+deci2;
        System.out.print("sum is: "+sum);

        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}