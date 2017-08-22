package guvi;
import java.util.*;
public class pro67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int total=scan.nextInt();
int friends=scan.nextInt();
int a[]=new int[total];
int count=0;
for(int i=0;i<total;i++){
	a[i]=scan.nextInt();
}
int b[]=new int[friends];
for(int i=0;i<friends;i++){
	b[i]=scan.nextInt();
}
for(int i=0;i<friends;i++){
	int n=b[i]-1;
	if(a[n]==1){
		count+=0;
	}else if(a[n]==0){
		count+=1;
	}
}
if(count>=1){
	System.out.println("yes");
}else{
	System.out.println("no");
}
	}

}
