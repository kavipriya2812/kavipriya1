package rrr;
import java.util.*;
public class player43 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String str2=scan.nextLine();
		int len=str.length();
		int len2=str2.length();
		int count=0;
		if(len>len2){
			for(int i=0;i<len;i++){
				if(str.substring(i,i+len2).equals(str2)){
					count=0;break;
				}else{
					count++;
				}
			}
		}
		if(len2>len){
			for(int j=0;j<len2;j++){
				if(str2.substring(j,j+len).equals(str)){
					count=0;break;
				}else{
					count++;
				}
			}
		}
		if(count==0){
			System.out.println("substring");
		}else{
			System.out.println("not a substring");
		}

	}

}
