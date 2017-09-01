package guvi;
import java.util.*;
public class hunter75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=scan.nextInt();
}
for(int i=0;i<n-1;i++){
	if(a[i]>a[i+1]){
		System.out.print(a[i+1]+" ");
	}else{
		System.out.print("-1"+" ");
	}
	
}System.out.print("-1"+" ");
	}

}
