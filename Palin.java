package palin;
import java.util.Scanner;
public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number,rev=0,rmd;
Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
number=scan.nextInt();
int n=number;
while(number>0)
{
	rmd=number % 10;
	rev=rev*10+rmd;
	number=number/10;
}
if(rev==n)
{
	System.out.println("palindrome");
}
else{
	System.out.println("not a palindrome");
}
	}

}
