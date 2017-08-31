package beginner;
import java.util.*;
public class Beginner34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
int count=0;
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>='0' && str.charAt(i)<='9'){
		count++;
	}
}System.out.println(count); 
	}

}
