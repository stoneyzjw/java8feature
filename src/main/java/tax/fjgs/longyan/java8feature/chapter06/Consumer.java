package tax.fjgs.longyan.java8feature.chapter06;

public class Consumer extends Thread
{
	private Buffer buffer;

	public Consumer(Buffer buffer)
	{
		this.buffer = buffer;
	}

	public void run()
	{
		int data;
		while (true)
		{
			data = buffer.consume();
		}
	}
}

