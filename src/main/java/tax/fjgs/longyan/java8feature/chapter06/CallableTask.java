package tax.fjgs.longyan.java8feature.chapter06;

import java.util.concurrent.Callable;
import java.util.Random;

public class CallableTask implements Callable<Integer>
{
	private int taskId;

	private int loopCounter;

	private Random random = new Random();

	/*
	 * some comment
	 * 用于测试
	 */
	public CallableTask(int taskId, int loopCounter)
	{
		this.taskId			= taskId;
		this.loopCounter	= loopCounter;
	}

	@Override public Integer call() throws InterruptedException
	{
		int totalSleepTime = 0;
		for (int i = 0; i <= loopCounter; i++)
		{
			try
			{
				int sleepTime = random.nextInt(10) + 1;
				System.out.println("任务#" + this.taskId + " - Iteration #" + i + " 将睡眠 " + sleepTime + "秒。");
				Thread.sleep(sleepTime * 1000);
				totalSleepTime = totalSleepTime + sleepTime;
			}
			catch (InterruptedException e)
			{
				System.out.println("任务#" + this.taskId + "意外中断。");
				throw e;
			}
		}
		return totalSleepTime;
	}
}
