package org.razertory.datastructure.thread;

/**
 * 继承Thread实现线程类
 * @author razertory
 * @see ExtendThreadRun
 */
public class ExtendThread extends Thread {
	public int count = 0;
	
	public void run(){
		try{
			while(count < 5){
				Thread.sleep(250);
				System.out.println("In Thread, count is " + count);
				count++;
			}
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("Thread terminating.");
	}
}
