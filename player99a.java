package guvi;

import java.util.Scanner;

public class player99a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;int rem=0;
		while(n>0){
			rem=n%10;
			for(int i=10;i>0;i--){
				sum+=rem*i;
			}
			n=n/10;
		}if(sum%11==0){
			System.out.println("ISBN number");
		}else{
			System.out.println("not an ISBN number");
		}
		}
	}