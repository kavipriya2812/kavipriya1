package countint;
import java.util.Scanner;
public class Countint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,count=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter an integer");
n=scan.nextInt();
while(n>0)
{
	n=n/10;
	count++;
}
System.out.println("count="+count);
	}

}
