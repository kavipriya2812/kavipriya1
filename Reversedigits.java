package beginner;

public class Reversedigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
int rem;
		int n=678;
		System.out.println("the reverse number is");
while(n>0)
{
	 rem=n%10;
	n=n/10;
	System.out.print(rem);
}
	}

}
