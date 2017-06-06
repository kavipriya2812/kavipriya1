package vo;import java.util.Scanner;

public class Vo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter any character");
char c=scan.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A' || c=='E' || c=='I'||c=='O' ||c=='U')
{
	System.out.println("vowel");
	}
else if((c>='a' && c<='z')||(c>='A' && c>='Z'))

	{System.out.println("consonant");
}

	}

}