package prime;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,m=0,flag=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
n=scan.nextInt();
m=n/2;
for(int i=2;i<=m;i++)
{
	if(n%i==0)
	{
		System.out.println("not a prime number");
		flag=1;
		break;
	}}
	if (flag==0)
	{
		System.out.println("prime number");
	}


	}

}
