package lp;

import java.util.Scanner;

public class Lp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
Scanner scan=new Scanner(System.in);
System.out.println("enter the year");
year=scan.nextInt();
if(year%400==0  && year%4==0)
{
	System.out.println("leap year");
}
else
{
	System.out.println("not a leap year");
}

	}

}
