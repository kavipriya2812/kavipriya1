package beginner;
import java.util.*;
public class Beginner35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
int count=0;int a=0;
for(int i=0;i<str.length();i++){
	if((str.charAt(i)>='0') && (str.charAt(i)<='9')|| ((str.charAt(i)>='a')&& (str.charAt(i)<='z'))||(str.charAt(i)==' ')){
		a++;
	}else{
		count++;
	}
}System.out.println(count);
	}

}
