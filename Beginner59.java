package guvi;
import java.util.*;
public class Beginner59 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			String str[]={"fd","fg","afg","g","jhgh","fd"};
int n=scan.nextInt();
for(int i=0;i<str.length;i++){
	if(str[i].length()==n){
		System.out.println(str[i]);
	}
}
	}

}
