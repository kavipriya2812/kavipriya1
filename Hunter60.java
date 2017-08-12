package guvi;
import java.util.*;
public class Hunter60 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=scan.nextInt();
		}
		for(int i=1;i<n;i++){
			if(a[0]==b[i]){
				System.out.println(i);
			}
		}

	}

}
