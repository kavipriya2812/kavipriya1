package beginner;

public class Beginner30 {

	public static void main(String[] args) {
		int sum=0;
		int oddsum=0;
		for(int i=1;i<=15;i++){
			sum+=i;
		}
		for(int j=15;j<=45;j+=2){
			oddsum+=j;
		}
System.out.println("sum="+sum+"\n"+"oddsum="+oddsum);
	}

}
