package rrr;
import java.util.Scanner;
public class jkhjh {

	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String b=scan.nextLine();
		int l=a.length();
		int v=b.length();
		for(int i=0;i<=l-v;i++){
			if(a.substring(i,v+i).equals(b)){
				System.out.println(i);
			}
			else{
				count++;
				}
			}
		if(count==(l-v)+1){
			System.out.println("-1");
			}

}}
