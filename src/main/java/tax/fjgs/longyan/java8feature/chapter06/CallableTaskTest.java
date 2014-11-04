package tax.fjgs.longyan.java8feature.chapter06;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class CallableTaskTest
{
	public static void main(String[] args)
	{
		ExecutorService exec = Executors.newFixedThreadPool(3);
		CallableTask task = new CallableTask(1, 3);
		CallableTask taskTemp = new CallableTask(2, 3);
		Future<Integer> submitTask = exec.submit(task);
		Future<Integer> tempTask = exec.submit(taskTemp);
		try
		{
			Integer result = submitTask.get();
			System.out.println("任务总睡眠时间：" + result + " 秒。");
			Integer result2 = tempTask.get();
			System.out.println("任务总睡眠时间：" + result2 + " 秒。");
		}
		catch (ExecutionException e)
		{
			System.out.println("Error in executing the task.");
		}
		catch (InterruptedException e)
		{
			System.out.println("Task execution has been interrupted.");
		}
		exec.shutdown();
	}
}

