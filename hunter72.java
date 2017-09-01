package guvi;
import java.util.*;
public class hunter72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
String a[]=str.split(" ");
for(int i=0;i<a.length;i++){
	if(i%2==0){
		String d=a[i];
		StringBuffer dh=new StringBuffer(d);
		dh.reverse();
		System.out.print(dh+" ");
	}else{
		System.out.print(a[i]+" ");
	}
}
	}

}
