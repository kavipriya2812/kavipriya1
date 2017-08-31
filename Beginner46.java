package beginner;
import java.util.*;
public class Beginner46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sum=0;
System.out.println("the multiplication table is");
for(int i=0;i<20;i++){
	sum+=n;
	System.out.print(sum+" ");
}
	}

}
