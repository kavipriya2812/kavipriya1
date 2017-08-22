package guvi;
import java.util.*;
public class pro61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str1=scan.nextLine();
String str2=scan.nextLine();
String output1="";
String output2="";
String st="0abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
for(int i=0;i<str1.length();i++){
	int c=Character.getNumericValue(str1.charAt(i)+1);
	output1+=st.charAt(c);}
output2+=str2.charAt(0);
for(int i=1;i<str2.length()-1;i++){
	int c=Character.getNumericValue(str2.charAt(i)+1);
	output2+=st.charAt(c);}
output2+=str2.charAt(str2.length()-1);
System.out.println(output1+" "+output2);
}
	}
