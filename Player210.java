package guvi;
import java.util.*;
public class Player210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
String str=Integer.toString(n);
int len=str.length();
int rem=0;int i=0;
int a[]=new int[len];
while(n>0){
	rem=n%10;
	a[i]=rem;
	n=n/10;
	i++;
	}
Arrays.sort(a);
for(int j=0;j<len;j++){
	System.out.println(a[j]);
}

	}

}
