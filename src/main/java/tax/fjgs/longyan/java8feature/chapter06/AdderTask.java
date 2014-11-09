package tax.fjgs.longyan.java8feature.chapter06;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Phaser;

public class AdderTask extends Thread
{
	/* field phaser */
	private Phaser phaser;

	private String taskName;

	private List<Integer> list;

	private static Random rand = new Random();

	public AdderTask(String taskName, Phaser phaser, List<Integer> list)
	{
		this.taskName	= taskName;
		this.phaser		= phaser;
		this.list		= list;
	}

	@Override public void run()
	{
		do
		{
			int num = rand.nextInt(10) + 1;
			System.out.println(taskName + " added " + num);
			list.add(num);
			phaser.arriveAndAwaitAdvance();
		}
		while (!phaser.isTerminated());
	}
}
