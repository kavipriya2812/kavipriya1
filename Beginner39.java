package beginner;
import java.util.*;
public class Beginner39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++){
	a[i]=scan.nextInt();
}
Arrays.sort(a);
System.out.println(a[a.length-1]);
	}

}
