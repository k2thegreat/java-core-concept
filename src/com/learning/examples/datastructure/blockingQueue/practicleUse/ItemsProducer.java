package com.learning.examples.datastructure.blockingQueue.practicleUse;

import java.util.concurrent.BlockingQueue;

public class ItemsProducer implements Runnable {

	private BlockingQueue<String> queue;

	public ItemsProducer(BlockingQueue<String> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		// produce items
		for (int i = 1; i <= 10; i++) {
			String msg = "" + i;
			try {
				// Thread.sleep(1000);
				queue.put(msg);
				System.out.println("Produced Item " + msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// adding finish message
		String msg = "finished";
		try {
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
