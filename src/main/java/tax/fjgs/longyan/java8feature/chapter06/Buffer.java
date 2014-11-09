package tax.fjgs.longyan.java8feature.chapter06;

public class Buffer
{
	private int data;

	private boolean empty;

	public Buffer()
	{
		this.empty = true;
	}

	public synchronized void produce(int newData)
	{
		while (!this.empty)
		{
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.data = newData;
		this.empty = false;
		this.notify();
		System.out.println("Produced: " + newData);
	}

	/**
	 * @param
	 * @return int
	 */

	public synchronized int consume()
	{
		while (this.empty)
		{
			try
			{
				this.wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.empty = true;
		this.notify();
		System.out.println("Consumed: " + data);
		return data;
	}
}

