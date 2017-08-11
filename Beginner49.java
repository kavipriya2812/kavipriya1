package guvi;
import java.util.*;
public class Beginner49 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int [n];
		int b[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int j=0;j<n;j++){
			b[j]=scan.nextInt();
		}
		for(int k=0;k<n;k++){
			for(int t=0;t<n;t++){
				if(k==t){
					c[k]=a[k]+b[t];
					System.out.print(c[t]+" "+" ");
					
				}
			}
		}

	}

}
