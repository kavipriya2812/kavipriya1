package guvi;
import java.util.*;
public class Player98 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[100];
		int count=0;
		for(int i=0;i<4;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<4;i++){
			if(a[i]==n){
				count+=1;
			}else{
				count+=0;
			}
		}
		if(count>=1){
			System.out.println(true);
		}else{
			System.out.println(false);
		}

	}

}
