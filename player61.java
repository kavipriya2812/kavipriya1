package guvi;
import java.util.*;
public class player61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n1=scan.nextInt();
int a[]=new int[n1];
for(int i=0;i<n1;i++){
	a[i]=scan.nextInt();
}
int n=scan.nextInt();
for(int i=0;i<n1-1;i++){
	if((a[i]+a[i+1])==n){
		System.out.println(a[i]+","+a[i+1]);
	}
}

	}

}
