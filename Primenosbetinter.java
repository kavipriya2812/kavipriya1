package set2B14;

public class Primenosbetinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
for(int i=0;i<=100;i++)
{
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=0;
			break;
		}
		else
		{
			flag=1;
		}
		}
	if(flag==1)
	{
		System.out.println(i);
	}
}
	}
}
