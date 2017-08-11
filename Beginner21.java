package guvi;
import java.util.*;
public class Beginner21 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int n1=0;
	int n2=1;
	System.out.print(n1+" "+n2+" ");
	int n3;
	int count=2;
	while(count<n){
		n3=n1+n2;
		System.out.print(n3+" ");
		count++;
		n1=n2;
		n2=n3;
	}
	}

}
