package com.codetest.programchallenge1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Randomizer implements Runnable{
  
	private final BlockingQueue<Integer> q1;
	private final BlockingQueue<String> q2;

    public Randomizer(BlockingQueue<Integer> q1,BlockingQueue<String> q2) {
        this.q1 = q1;
        this.q2 = q2;
    }


	public  int generateRandomNumber() {
		Random rand = new Random();
		return ( 1 + rand.nextInt((100 - 1) + 1));
	}

	@Override
	public void run() {
		
		try {
			int number = generateRandomNumber();
			q1.put(number);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(null != q2 && q2.size() > 0){
			try {
				String result = q2.take();
				String[] arr = result.split(",");
				if(null != arr && arr.length >0){
					System.out.println(arr[0]+" Is A Prime : "+arr[1].toUpperCase());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}//end if
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			run();
		}
	}
}