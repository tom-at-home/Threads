package Mit_Inneren_Klassen;

import java.lang.Exception;

public class ThreadWithInnerClasses{
	
	
	// Beispiel 1 Klasse erweitert Thread
	class ExtendingClass extends Thread {

		public void run() {
			while(true) {
				System.out.println("Welt.1." + this.getId() );
				try {
					Thread.sleep(250);
				}catch( Exception e) {}
			}
		}

	}
	
	// Beispiel 2 Klasse implements Runnable
	class ImplementingClass implements Runnable {

		public  void run() {
			while(true) {
				System.out.println("Welt.2");				
				try {
					Thread.sleep(250);
				}catch( Exception e) {}
			}
		}

	}
	
	public void ausfuehren() {

		// Beispiel 1
		ExtendingClass ec = new ExtendingClass();
		ec.start();
		
		// Beispiel 2 
		Thread thread = new Thread( new ImplementingClass() );	
		thread.start();

		// Hauptschleife
		while(true) {
			System.out.println("Hallo");
			try {
				Thread.sleep(250);
			}catch( Exception e) {}
						
		}
		
	}
	
	public static void main(String[] args) {
		ThreadWithInnerClasses twic = new ThreadWithInnerClasses();
		twic.ausfuehren();
	}
}