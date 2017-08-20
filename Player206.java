package guvi;
import java.util.*;
public class Player206 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str1=scan.next();
	for(int i=0;i<str1.length();i++){
	char ch=str1.charAt(i);
	if(Character.isLowerCase(ch)){
		System.out.println(Character.toUpperCase(ch));
	}
	else{
		System.out.println(Character.toLowerCase(ch));
	}
		
	}
	}	
}