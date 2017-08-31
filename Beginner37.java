package beginner;
import java.util.*;
public class Beginner37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println(a+" "+b);
	}

}
