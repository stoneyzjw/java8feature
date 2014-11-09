package tax.fjgs.longyan.java8feature.chapter06;

import java.util.Random;
/*
 * 测试
 */

public class Producer extends Thread
{
	private Buffer buffer;

	public Producer(Buffer buffer)
	{
		this.buffer = buffer;
	}

	/*
	 * 测试git stash命令。
	 */
	public void run()
	{
		Random rand = new Random();
		while (true)
		{
			int n = rand.nextInt();
			buffer.produce(n);
		}
	}
}
