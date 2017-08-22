package guvi;
import java.util.*;
public class pro69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
int a[]=new int[100];
int b[]=new int[100];
int y=0;
int A=0;int B=1;int rem=0;int rem2=0;int sum1=0;int sum2=0;int digit3=0;int min=0;double output=0;
for(int i=0;i<str.length();i++){
	if(str.charAt(i)>='0' && str.charAt(i)<='9'){
		a[y]=Integer.parseInt(str.substring(i,i+1));
		b[y]=a[y];
		y++;
	}
}
Arrays.sort(b);
int last=b[b.length-1];
for(int i=0;i<y;i++){
	A+=(last*a[i]);
	
}
while(A> 0)
{while(A != 0)
           {rem = A%10;
            sum1 = sum1+rem;
            A=A/10;}
           if(sum1 > 9)
           {A = sum1;
            sum1 = 0;}}
	int first=b[100-y];
	 for(int i=0;i<y;i++){
		 B*=(first+a[i]);
	 }
	
		 while(B!=0){
			 rem2=B%10;
			 sum2+=rem2;
			 B=B/10;
		 }if(sum2>9){
			 B=sum2;
			 sum2=0;
		 
	 }
	 if(sum1<sum2){
		 min=sum1;
	 }else{
		 min=sum2;
	 }
	 output=Math.pow(min,2);
	 System.out.println(output);
	}

}
