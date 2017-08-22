package guvi;

import java.util.Scanner;

public class pro68a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String first_name=scan.nextLine();
		String last_name=scan.nextLine();
		int pin=scan.nextInt();
		int n=scan.nextInt();
		String smallname="";
		String longname="";
		int len1=first_name.length();
		int len2=last_name.length();
		String step2="";
		String step3="";
		if(len1<len2){
			smallname=first_name;
			longname=last_name;
		}
		if(len1>len2){
			smallname=last_name;
			longname=first_name;
		}if(len1==len2){
			if(first_name.charAt(0)<last_name.charAt(0)){
				smallname=first_name;
				longname=last_name;
			}
			if(first_name.charAt(0)<last_name.charAt(0)){
				longname=first_name;
				smallname=last_name;
			}
		}
		 step2+=longname.charAt(0);
		step2+=smallname;
		 String pin1=Integer.toString(pin);
		 int pinlength=pin1.length();
		 step2+=pin1.charAt(n-1);
		 step2+=pin1.charAt(pinlength-n);
		 for(int i=0;i<step2.length();i++){
			 if(step2.charAt(i)>='a'&& step2.charAt(i)<='z'){
				step3+=step2.substring(i,i+1).toUpperCase();
			 }
			 if(step2.charAt(i)>='A'&& step2.charAt(i)<='Z'){
				 step3+=step2.substring(i,i+1).toLowerCase();
			 }else if(step2.charAt(i)>='0' && step2.charAt(i)<='9'){
				 step3+=step2.charAt(i);
			 }
		 }
		 System.out.println(step3);
	}

}
