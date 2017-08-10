package rrr;
import java.util.*;
public class player31 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int sum=0;int len=1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='(' && str.charAt(i+1)==')'){
				sum++;
			}
		}
		len=sum*2;
		System.out.println(len);

	}

}
