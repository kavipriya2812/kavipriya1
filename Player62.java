package guvi;
import java.util.*;
public class Player62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for(int i=1;i<n;i+=2){
	if(n%i!=0){
		System.out.println(i);break;
	}
}
	}

}
