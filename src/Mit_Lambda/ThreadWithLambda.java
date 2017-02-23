package Mit_Lambda;

public class ThreadWithLambda {

	// Testkommentar
	String name = "Klassenname";
	int var = 650;

	public static void main(String[] args){

		Runnable thread = () -> {
            while(true) {
                System.out.println(Thread.currentThread().getName() + " is running");

                try {
                    Thread.sleep(1000);
                }catch( InterruptedException e) {}
            }
		};


			/*Thread thread = new Thread( new Runnable() {

				public void run() {
					while(true) {
						System.out.println("Ausgabe");

						try {
							Thread.sleep(1000);
						}catch( InterruptedException e) {}
					}
				}});
		}*/

		new Thread(thread).start();
		//thread.start();
		
		while(true) {
			try {
				Thread.sleep(1000);
			}catch( InterruptedException e) {}

			System.out.println("Ausgabe der Haupt-Prozesses");
		}
	}
}
