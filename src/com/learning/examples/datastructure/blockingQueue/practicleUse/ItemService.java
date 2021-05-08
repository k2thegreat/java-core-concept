package com.learning.examples.datastructure.blockingQueue.practicleUse;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ItemService {
	
	public static void main(String[] args) {
		
		// Creating BlockingQueue of size 3
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
		
		ItemsProducer producer = new ItemsProducer(queue);
		
		ItemConsumer consumer = new ItemConsumer(queue);
		
		// new Thread(consumer).start();
		// starting producer to produce items in queue
		new Thread(producer).start();
		
		//starting consumer to consume items from queue
		new Thread(consumer).start();
		System.out.println("Items Producer and Items Consumer has been started");
				
	}

}
