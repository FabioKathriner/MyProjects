package ch.hslu.E1;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Tasks {

	private static final Logger LOG = LogManager.getLogger(Tasks.class);
	
	private int counter = 0;
	private int counterTask1 = 0;
	private int counterTask2 = 0;
	private int counterTask3 = 0;

	
		
	public void task(final int n) throws InterruptedException {
		task1(); task1(); task1(); task1();
		for (int i=0; i<n; i++) {
			task2(); task2(); task2();
			for (int j = 0; j<n; j++) {
				task3(); task3();				
			}
		}
		LOG.info("Die Gesamtzahl der Task Aufrufe beträgt:" + counter);
		LOG.info("Die Gesamtzahl der Task1 Aufrufe beträgt:" + counterTask1);
		LOG.info("Die Gesamtzahl der Task2 Aufrufe beträgt:" + counterTask2);
		LOG.info("Die Gesamtzahl der Task3 Aufrufe beträgt:" + counterTask3);
	}
	
	

	public void task3() throws InterruptedException {		
		counter++;
		counterTask1++;
		Thread.sleep(10);
			}

	public void task2() throws InterruptedException {
		counter++;
		counterTask2++;
		Thread.sleep(0);
	}

	public void task1() throws InterruptedException {
		counter++;
		counterTask3++;
		Thread.sleep(0);
	}
	
	public static void main(final String[] args) throws InterruptedException {
		long timecounter = System.currentTimeMillis();
		Tasks taskStart = new Tasks();
		taskStart.task(4);
		LOG.info("Die Gesamte Ausführungsdauer beträgt: " + (System.currentTimeMillis() - timecounter) + "ms");
	}
}
