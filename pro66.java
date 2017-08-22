package guvi;
import java.util.*;
public class pro66 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int total=scan.nextInt();
		int kth=scan.nextInt();
		float sum=0;
		int a[]=new int[total];
		for(int i=0;i<total;i++){
			a[i]=scan.nextInt();
		}
		int b=scan.nextInt();
		for(int i=0;i<total;i++){
			sum+=((double)a[i]/2);
		}
		if(sum==b){
			System.out.println(a[kth]/2);
		}else{
			System.out.println("Bon Appetit");
		}

	}

}
