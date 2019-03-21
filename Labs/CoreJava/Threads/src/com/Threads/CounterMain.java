package com.Threads;

public class CounterMain {
	public static ThreadCounter counter;

	public static class CounterThread implements Runnable {

		@Override
		public void run() {
			synchronized (counter) {
				counter.incrementCount();
				counter.incrementCount();
				counter.incrementCount();
				counter.decrementCount();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				counter.decrementCount();
				counter.incrementCount();
				counter.incrementCount();
				System.out.println(counter.displayCount());
			}
		}
	}

	public static void main(String[] args) {
		counter = new ThreadCounter();
		Thread t1 = new Thread(new CounterThread());
		t1.start();
		Thread t2 = new Thread(new CounterThread());
		t2.start();
		System.out.println("Inside main thread Synchronized");
		System.out.println("Main Thread:" + counter.displayCount());

	}
}
