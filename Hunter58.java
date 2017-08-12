package guvi;
import java.util.*;
public class Hunter58 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int diff=scan.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if((Math.abs(a[i]-a[j]))==diff){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
