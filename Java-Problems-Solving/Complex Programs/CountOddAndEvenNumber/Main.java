
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] a={1,4,6,2,5,8,9};
		int evenCount=0,oddCount=0;
		for(int i=0;i<a.length;i++){
		    if(a[i]%2==0){
		        evenCount++;
		    }else{
		        oddCount++;
		    }
		}
		System.out.println("EVEN COUNT IS :"+evenCount);
			System.out.print("ODD COUNT IS :"+oddCount);
	}
}