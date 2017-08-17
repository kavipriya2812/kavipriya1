package guvi;
import java.util.*;

class function{
	void circle(int r){
		double area=3.14*r*r;
		System.out.println("area of circle is"+area);
	}
	void rectangle(int l,int b){
		double area=l*b;
		System.out.println("area of rectangle is"+area);
	}
	void triangle(int b,int h){
		double area=0.5*b*h;
		System.out.println("area of triangle is"+area);
	}
}public class Player212 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int r=scan.nextInt();
		int l=scan.nextInt();
		int b=scan.nextInt();
		int h=scan.nextInt();
		function f=new function();
		f.circle(r);
		f.rectangle(l,b);
		f.triangle(b,h);

	}

}
