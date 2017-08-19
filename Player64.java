package guvi;
import java.util.*;
public class Player64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=scan.nextInt();
}
int num=scan.nextInt();
for(int i=0;i<n;i++){
	if(a[i]==num){
		for(int k=i;k<n;k++){
			System.out.print(a[k]+" ");
		}
	}
}
	}

}
