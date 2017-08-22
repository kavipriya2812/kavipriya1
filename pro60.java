package guvi;
import java.util.*;
public class pro60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
int j=3;
int k=j;
for(int i=1;i<=t;i++){
	if(k>=1){
		System.out.println(k);
		k--;
	}
	if(k<1){
		j=j*2;
		k=j;
		
	}
}
	}

}
