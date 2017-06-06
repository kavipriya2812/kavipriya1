package odd;
import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
Scanner scan=new Scanner (System.in);
System.out.println("enter any number");
n=scan.nextInt();
if(n%2==0)
{
	System.out.println("even");
}else
{
	System.out.println("odd");
}
	}

}
