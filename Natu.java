package natu;
import java.util.Scanner;
public class Natu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
n=scan.nextInt();
for(int i=1;i<=n;i++)
{
	sum=sum+i;
}
System.out.println(+sum);
	}

}
