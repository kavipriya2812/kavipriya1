package guvi;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
int fact=1;
		Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
int n=scan.nextInt();
for(int i=1;i<=n;i++){
	fact=fact*i;
}
	System.out.println("the factorial of"+n+"="+fact);

	}

}
