package guvi;
import java.util.*;
public class Beginner57 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=Integer.toString(n);
		int l=str.length();
		int sum=0;
			for(int i=0;i<l;i+=2){
				String s=str.substring(i,i+1);
				int b=Integer.parseInt(s);
				sum+=Math.pow(b,2);
			}
			for(int i=1;i<l;i+=2){
				String s=str.substring(i,i+1);
				int b=Integer.parseInt(s);
				sum+=Math.pow(b,3);
			}
			System.out.println(sum);
		}

	}

