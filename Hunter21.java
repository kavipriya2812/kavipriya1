package guvi;
import java.util.*;
public class Hunter21 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int rows=scan.nextInt();
			int columns=scan.nextInt();
			int a[][]=new int[rows][columns];
			int b[][]=new int[rows][columns];
			for(int i=0;i<rows;i++){
				for(int j=0;j<columns;j++){
					a[i][j]=scan.nextInt();
					b[i][j]=a[i][j];
				}
			}
			for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(a[i][0]==0){
					b[i][j]=0;
				}
			}
			}
			System.out.println("\n");
			for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
					if(a[0][j]==0){
						{
							b[i][j]=0;
					}}}}
for(int i=0;i<rows;i++){
	for(int j=0;j<columns;j++){
		System.out.print(b[i][j]+" ");
	}System.out.println();
}
	}}
