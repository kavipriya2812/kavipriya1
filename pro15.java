package pro;
import java.util.*;
public class pro15 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		for(int i=n-1;i>=0;i--){
			System.out.println(a[i]);
		}
		
	}
}
