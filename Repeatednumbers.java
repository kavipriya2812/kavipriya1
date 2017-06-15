package hunter;

public class Repeatednumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={12,10,12,14,16,17};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			System.out.println(a[i]);
		}
	}
}
	}

}
