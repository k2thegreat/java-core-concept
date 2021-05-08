package com.learning.examples.datastructure.blockingQueue.practicleUse;

import java.util.concurrent.BlockingQueue;

public class ItemConsumer implements Runnable {

	private BlockingQueue<String> queue;

	public ItemConsumer(BlockingQueue<String> q) {
		this.queue = q;
	}

	@Override
	public void run() {
		try {
			String msg;
			// consuming messages until exit message is received
			while (!(msg = queue.take()).equals("finished")) {
				// Thread.sleep(3000);
				System.out.println("Consumed Item " + msg);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
