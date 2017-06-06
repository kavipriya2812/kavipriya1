package lar;
import java.util.Scanner;

public class Lar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner scan=new Scanner(System.in);
System.out.println("enter three numbers");
a=scan.nextInt();
b=scan.nextInt();
c=scan.nextInt();
if(a>b && a>c)
{
	System.out.println("a is greater");
}
else if(b>c)
{
	System.out.println("b is greater");
}
else
{
	System.out.println("c is greater");
}

	}

}
