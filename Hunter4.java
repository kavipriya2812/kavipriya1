package rrr;

import java.util.Scanner;

public class Hunter4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]={1,1,2,2,3,3,4,4,5,5,7};
		int count=0;
		for(int i=0;i<11;i++){
			boolean flag=true;count=0;
			for(int j=0;j<i;j++){
				if(a[i]==a[j]){
					flag=false;
				}
			}
		
		if(flag==true){
		for(int k=0;k<11;k++){
			if(a[i]==a[k]){
				count++;
			}
		}
		}
		if(count==1){
	System.out.println(a[i]);	
	
		}
	}


	}

}
