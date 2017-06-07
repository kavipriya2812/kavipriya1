package power;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
int power,t=1;
Scanner scan=new Scanner (System.in);
System.out.println("enter the number");
number=scan.nextInt();
System.out.println("enter thepower");
power=scan.nextInt();
for(int i=1;i<=power;i++)
{
	t=t*number;
}
System.out.println("power is:"+t);
	}

}
