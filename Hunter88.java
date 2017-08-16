package guvi;
import java.util.*;
public class Hunter88 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String output="";
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)!=str.charAt(j)){
					output+=str.substring(i,i+1);
				}
				else{
					continue;
				}
			}
		}
     String reverse=new StringBuffer(output).reverse().toString();              
	}

}
