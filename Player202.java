package guvi;
import java.util.*;
public class Player202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
String v="";
String c="";
for(int i=0;i<str.length();i++){
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
		v+=str.charAt(i);
	}else{
		c+=str.charAt(i);
	}
}System.out.println(v+c);
	}

}
