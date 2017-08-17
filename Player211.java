package guvi;
import java.util.*;
public class Player211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int rows=scan.nextInt();
int columns=scan.nextInt();
int a[][]=new int[rows][columns];
for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
		a[i][j]=scan.nextInt();
	}}
for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
System.out.print(a[i][j]);
	}
}}
}
