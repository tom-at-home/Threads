package Mit_Anonymer_Schnittstelle;

public class ThreadWithAnonymInterface {
	String name = "Klassenname";
	int var = 650;

	public static void main(String[] args){
		
		
		Thread thread = new Thread( new Runnable() {
			
			public void run() {
				while(true) {
					System.out.println("Ausgabe");
					
					try {
						Thread.sleep(1000);
					}catch( InterruptedException e) {}
			}
		}});
		
		thread.start();
		
		while(true) {
			try {
				Thread.sleep(1000);
			}catch( InterruptedException e) {}

			System.out.println("Ausgabe der Haupt-Prozesses");
		}
	}
}
