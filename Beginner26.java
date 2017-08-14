package guvi;
import java.util.*;
public class Beginner26 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int alpha=0;
		int digits=0;
		int special=0;
		for(int i=0;i<str.length();i++){
		if((str.charAt(i)>='a'&& str.charAt(i)>='z')||(str.charAt(i)>='A'&& str.charAt(i)>='Z')){
			alpha++;
		}
		else if(str.charAt(i)>='0'&& str.charAt(i)>='9'){
			digits++;
		}else{
			special++;
		}}
System.out.println("alphabets ="+alpha+"\n"+"digits="+digits+"\n"+"special characters="+special);}
}