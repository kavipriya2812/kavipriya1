package rrr;
import java.util.*;
public class numbersinstring {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	int flag=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)>=48 && str.charAt(i)<=57){
			flag+=1;
		}}if(flag==str.length()){
			System.out.println("true");}
		else{
			System.out.println("false");
		}
	}
	}
