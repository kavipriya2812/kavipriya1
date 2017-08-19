package guvi;
import java.util.*;
public class player76 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int count=0;int e=0;
		int count1=0;int o=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]!=1){
			if(a[i]%2==0){
				count++;
				 e=a[i];
			}else{
				count1++;o=a[i];
			}}
		}if(count==1){
			System.out.println(e);
		}
		if(count1==1){
			System.out.println(o);
		}

	}

}
