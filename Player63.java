package guvi;
import java.util.*;
public class Player63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int count=0;
for(int i=0;i<n;i++){
	a[i]=scan.nextInt();
	b[i]=scan.nextInt();
}
for(int i=0;i<n;i++){
	for(int j=i;j<n;j++){
		if(a[i]==b[j]){
		System.out.println(a[i]);
		}}}
}}