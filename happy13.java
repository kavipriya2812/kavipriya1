package rrr;

import java.util.Scanner;

public class happy13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int rem=0;
		int rem1=0;
		int sum2=0;
		int sum=0;
		if(n>0){
			while(n>1){
				rem=n%10;
				sum+=Math.pow(rem,2);
			     n=n/10;
			}
			if(sum<100){
				rem1=sum%10;
				sum2+=Math.pow(rem1,2);
				sum=sum/10;
			}
			if(sum2>100){
				String str=Integer.toString(sum);
				String sub=str.substring(0,2);
				sum2=Integer.parseInt(sub);
			}
			if(sum2==1){
				System.out.println("happy number");
				
			}
			else{
				System.out.println("not a happy number");
			}}
		}
	



	}


