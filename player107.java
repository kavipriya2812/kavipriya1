package guvi;
import java.util.*;
public class player107 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int n=str.length();
		String result="";
		for(int i=1;i<n;i++){
			if((str.charAt(0)=='-')&&(str.charAt(i)>='0'&& str.charAt(i)<='9')){
				result+=str.charAt(i);
			}else{
				result="-1";
			}
		}
		System.out.println(result);
	}

}
