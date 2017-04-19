package com.codetest.programchallenge1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class P1Test {
	public static void main(String[] args) throws InterruptedException {
		 BlockingQueue<Integer> q1 = new LinkedBlockingQueue<Integer>();
	     BlockingQueue<String> q2 = new LinkedBlockingQueue<String>();
	     Prime prime = new Prime(q1,q2);
	     Randomizer randomizer = new Randomizer(q1,q2);

	        new Thread(randomizer).start();
	        new Thread(prime).start();

	        Thread.sleep(5000);
	}
}
