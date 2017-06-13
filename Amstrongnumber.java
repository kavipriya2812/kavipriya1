package set2B14;

public class Amstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=103;
int temp=number;
int sum=0;
int a;
while(number>0)
{
	a=number%10;
	number=number/10;
	sum=sum+(a*a*a);
}
if(sum==temp)
{
	System.out.println("Amstrong number");
}
else
{
	System.out.println("not an amstrong number");
}
}

}
