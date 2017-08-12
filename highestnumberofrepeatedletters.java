package guvi;
import java.util.*;
public class highestnumberofrepeatedletters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] s=str.split(" ");
		int output=0;
		int ds=0;
		int aa[]=new int[s.length];
		int bb[]=new int[s.length];
		int max[]=new int[s.length];
		for(int i=0;i<s.length;i++){
			String j=s[i];
			int count=0;
			for(int k=0;k<j.length()-1;k++){
				for(int h=k+1;h<j.length();h++){
				if(j.charAt(k)==j.charAt(h)){
					count++;}
					
}}
			 aa[i]=count;bb[i]=count;}
			 Arrays.sort(bb);
			 for(int x=0;x<s.length;x++){
			 if(aa[x]==bb[s.length-1]){
				 System.out.println(s[x]);
			 }
					 }}}
