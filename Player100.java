package guvi;
import java.util.*;
public class Player100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String str1=scan.nextLine();
String str2=scan.nextLine();
String output="";
for(int i=0;i<=10;i++){
	int year1=Integer.parseInt(str1.substring(6,10));
	int year2=Integer.parseInt(str2.substring(6,10));
	if(year1>year2){
		output=str2;
	}
	if(year1<year2){
		output=str1;
	}
	if(year1==year2){
		int month1=Integer.parseInt(str1.substring(3,5));
		int month2=Integer.parseInt(str2.substring(3,5));
		if(month1>month2){
			output=str2;
		}
		if(month1<month2){
			output=str1;
		}
		if(month1==month2){
			int date1=Integer.parseInt(str1.substring(3,5));
			int date2=Integer.parseInt(str2.substring(3,5));
			if(date1>date2){
				output=str2;
			}
			if(date1<date2){
				output=str1;
			}
		}
	}
}System.out.println(output.substring(3,5)+"/"+output.substring(0,2)+"/"+output.substring(6));
	}

}
