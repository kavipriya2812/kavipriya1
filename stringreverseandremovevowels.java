package rrr;
import java.util.*;
public class stringreverseandremovevowels {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.nextLine();
	String equal="";
	String notequal="";
	String s=new StringBuffer(str).reverse().toString();
	for(int i=0;i<str.length();i++){
		if(s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e")||s.substring(i,i+1).equals("i")||s.substring(i,i+1).equals("o")||s.substring(i,i+1).equals("u")){
		equal+=s.substring(i,i+1);	
		}
		else{
			notequal+=s.substring(i,i+1);
		}
	}
	System.out.println(notequal);
	}

}
