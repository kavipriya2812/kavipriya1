package guvi;
import java.util.*;
public class Player65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int sum=0;
int rows=scan.nextInt();
int columns=scan.nextInt();
int a[][]=new int[rows][columns];
for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
		a[i][j]=scan.nextInt();
	}
}
int start_row=scan.nextInt();
int start_column=scan.nextInt();
int end_row=scan.nextInt();
int end_column=scan.nextInt();
for(int k=start_row;k<=end_row;k++){
	for(int t=start_column;t<=end_column;t++){
		sum+=a[k][t];
	}
}System.out.println(sum);
	}

}
