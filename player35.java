package guvi;
import java.util.*;
public class player35 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				System.out.print(str.charAt(i)+"*");
				}
			else{
					System.out.print(str.charAt(i));
				
			}}}}

