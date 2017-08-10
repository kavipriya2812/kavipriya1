package rrr;
import java.util.*;
public class player42 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(a);
		for(int j=0;j<n;j++){
		c[j]=a[j];
		}
		for(int k=0;k<n;k++){
			if(b[k]==c[k]){
				count++;
			}
		}
		if(count==a.length){
			System.out.println("sorted order");
		}else{
			System.out.println("not in sorted order");
		}
	}
}