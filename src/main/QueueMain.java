package main;
import java.util.Arrays;
public class QueueMain
{
	public static void main(String[] args)
	{
		QueueADT queue1 = new QueueADT();
		queue1.enqueue(50);
		queue1.enqueue(40);
		queue1.enqueue(30);
		System.out.println(Arrays.toString(queue1.queue));
//

//		TODO add method call for dequeue

	}
}
