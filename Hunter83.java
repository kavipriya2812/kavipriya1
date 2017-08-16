package guvi;
import java.util.*;
public class Hunter83 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>='0'&& str.charAt(i)<='9')&& (str.charAt(i+1)=='x')){
				if((str.charAt(i+2)>='a' && str.charAt(i+2)<='z')||(str.charAt(i+2)>='A'&& str.charAt(i+2)<='Z')){
				for(int j=0;j<Integer.parseInt(str.substring(i,i+1));j++){
					System.out.println(str.charAt(i+2));
				}
				i=i+2;
			}
		}else{
			System.out.println(str.charAt(i));
		}
		

		}
}
}