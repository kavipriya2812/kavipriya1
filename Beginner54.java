package guvi;
import java.util.*;
public class Beginner54 {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
String str1=scan.nextLine();
int l1=str.length();
int l2=str1.length();
int count=0;
if(l1>l2){
	for(int i=0;i<=l1-l2;i++){
		if(str.substring(i,i+l2).equals(str1)){
			count++;
		}
	}
}
	if(l2>l1){
		for(int j=0;j<=l2-l1;j++){
			if(str1.substring(j,j+l1).equals(str)){
				count++;
			}
		}
	}
	System.out.println(count);}
}