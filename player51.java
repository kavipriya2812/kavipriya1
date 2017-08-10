package rrr;
import java.util.*;
public class player51 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=scan.nextInt();
}
Arrays.sort(a);
System.out.println(a[a.length-2]);
	}

}
