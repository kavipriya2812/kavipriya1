package beginner;
import java.util.*;
public class Beginner38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a>b && a>c){
	System.out.println(a);
}else if(b>c){
	System.out.println(b);
}else{
	System.out.println(c);
}
	}

}