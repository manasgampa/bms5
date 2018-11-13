package net.antra.controller1;

public class ThreadEx implements Runnable{

	
	public static void main(String[] args) {
		ThreadEx th=new ThreadEx();
		Thread tr1=new Thread(th);
		Thread tr2=new Thread(th);
		tr1.start();
		tr2.start();
		
	
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
	}
}
