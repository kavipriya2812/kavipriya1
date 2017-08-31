package hunter;
import java.util.*;
public class Hunter32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int position=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=scan.nextInt();
	} 
	if(n!=4 && n!=8 && n!=16 && n!=32 && n!=64 &&n!=128){
	int len=n/2;
	if(len%2==0){
		position=len+1;
	}else{
		position=len;
	}}else{
		position=n-1;
	}
	System.out.println("the element is "+a[position]);
	System.out.println("the position in the original queue is "+(position+1));
	}

}
