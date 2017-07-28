package rrr;
import java.util.*;
public class G132 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String result=" ";
		for(int i=n;i>=0;i--){
			for(int j=0;j<i;j++){
			System.out.print("*");
			 result=result+"*";
				}System.out.println(" "+result);
				result="";
		}

	}

}
