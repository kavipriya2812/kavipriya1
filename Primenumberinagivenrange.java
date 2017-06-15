package beginner;

public class Primenumberinagivenrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int flag=0;
		int count=0;
		for(int i=2;i<100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					{
					break;
				}
				else if(i==j+1)
				{
					System.out.println(i);
				}
			}
		}
		
}
}
