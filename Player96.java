package guvi;
import java.util.*;
public class Player96 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=Integer.toString(n);
		int sum=((Integer.parseInt(str.substring(0,1))+(Integer.parseInt(str.substring(str.length()-1)))));
		System.out.println(sum);
	}
}
