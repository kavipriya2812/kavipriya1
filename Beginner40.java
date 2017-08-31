package beginner;
import java.util.*;
public class Beginner40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n1=1;
int n2=1;
int n3=0;
System.out.print(n1+" "+n2+" ");
for(int i=0;i<10;i++){
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.print(n3+" ");
	n3=0;
}
	
	}

}
