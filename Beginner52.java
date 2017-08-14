package guvi;
import java.util.*;
public class Beginner52 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String str=Integer.toString(n);
		int a=0;
		int rem=0;
		for(int i=0;i<str.length();i++){
				String s=str.substring(i,i+1);
				a=Integer.parseInt(s);
			switch(a){
		case 1:{System.out.println("one");break;}
		case 2:{System.out.println("two");break;}
		case 3:{System.out.println("three");break;}
		case 4:{System.out.println("four");break;}
		case 5:{System.out.println("five");break;}
		case 6:{System.out.println("six");break;}
		case 7:{System.out.println("seven");break;}
		case 8:{System.out.println("eight");break;}
		case 9:{System.out.println("nine");break;}
		}

	}

}
}