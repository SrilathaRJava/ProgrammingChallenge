package com.codetest.programchallenge1;

import java.util.concurrent.BlockingQueue;

public class Prime implements Runnable{
	private final BlockingQueue<Integer> q1;
	private final BlockingQueue<String> q2;

    public Prime(BlockingQueue<Integer> q1,BlockingQueue<String> q2) {
        this.q1 = q1;
        this.q2 = q2;
    }
    
    public boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

	@Override
	public void run() {
		if(q1 != null && q1.size() >0){
			try {
				int number =q1.take();
				if(isPrime(number)){
					q2.put(number+","+true);
				}else{
					q2.put(number+","+false);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
