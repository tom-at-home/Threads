package Mit_Extends_Thread_Und_Synchronisation;

public class Program {
	
	public static void main(String[] args){
		
		Integer counter = 0;
		
		ClassExtendsThread cet1 = new ClassExtendsThread("Erste Instanz mit Thread", counter);
		ClassExtendsThread cet2 = new ClassExtendsThread("Zweite Instanz mit Thread", counter);
		
		cet1.start();
		cet2.start();
		
		try{
			// Die Main Methode wartet jetzt, 
			// bis Thread von cet1 + cet2 die ihre run Methode abgearbeitet haben.
			cet1.join();
			cet2.join();
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		// Diese Ausgabe erscheint jetzt tatsaechlich zum Schluss,
		// da mit join auf die Threads gewartet wurde
		System.out.println("Ende des Programms");
		
	}
	
}