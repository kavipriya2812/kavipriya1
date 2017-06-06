package aorn;
import java.util.Scanner;
public class Aorn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char c;
Scanner scan=new Scanner (System.in);
System.out.println("enter any character");
c=scan.next().charAt(0);
if(c>='a'&&c<='z')
{
	System.out.println("alphabet");
}
else
{
	System.out.println("not an alphabet");
}
	}

}
