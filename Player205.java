package guvi;
import java.util.*;
public class Player205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
String str=Integer.toString(n);
int len=str.length();
int sum=0;
for(int i=0;i<=len-1;i++){
	if(i%2!=0){
		sum+=Integer.parseInt(str.substring(i,i+1));
	}
}System.out.println(sum);
	}

}
