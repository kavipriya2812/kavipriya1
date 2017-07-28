package rrr;
import java.util.Scanner;
public class jkhjh {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String b=scan.nextLine();
		int l=a.length();
		int  v=b.length();
		for(int i=0;i<=l-v;i++){
			if(a.substring(i,v+i).equals(b)){
				System.out.println(i);
			}
			else{
				System.out.println("-1");break;}}
			}

}
