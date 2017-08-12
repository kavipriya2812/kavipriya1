package guvi;
import java.util.*;
public class rotate {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();
	int rotate=scan.nextInt();
     int a[]=new int[size];
     for(int i=0;i<size;i++){
    	 a[i]=scan.nextInt();
     }
     int h=size-rotate;
     for(int i=h;i<size;i++){
    	 System.out.print(a[i]+" ");
     }
     for(int i=0;i<h;i++){
    	 System.out.print(a[i]+" ");
     }
	}

}
