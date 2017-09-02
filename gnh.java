package ramya;
import java.util.*;
public class gnh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++) {
	a[i]=scan.nextInt();
}Arrays.sort(a);
System.out.println("the fourth largest is"+a[n-4]);
System.out.println("the "+k+" largest is "+a[n-k]);
	}

}
