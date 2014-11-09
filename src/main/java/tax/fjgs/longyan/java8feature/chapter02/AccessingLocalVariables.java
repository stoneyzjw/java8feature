package tax.fjgs.longyan.java8feature.chapter02;

public class AccessingLocalVariables
{
	public static void main(String[] args)
	{
		int x = 100;
		final int y = 200;
		class LocalInner
		{
			void print()
			{
				System.out.println("x = " + x);
				System.out.println("y = " + y);
			}
		}
		// x = 100; x must effectively final
		LocalInner li = new LocalInner();
		li.print();
		/*
		 * Test for git
		 */
	}
}
