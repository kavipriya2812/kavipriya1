package guvi;
import java.util.*;
public class Player213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
String f="";
String reverse="";
int count=0;
for(int i=0;i<str.length();i++){count=0;
	for(int j=i+1;j<str.length();j++){
	if(str.charAt(i)==str.charAt(j)){
		count++;
	}
}if(count==0){
	f+=str.charAt(i);
}
}
reverse=new StringBuffer(f).reverse().toString();
System.out.println(reverse);
}

}
