package Mit_Extends_Thread_Und_Synchronisation;

public class ClassExtendsThread extends Thread {
	
	String name;
	Integer counter;
	
	ClassExtendsThread(String name, Integer counter){
		this.name = name;
		this.counter = counter;
	}
	
	public void run(){
		System.out.println("Starte Thread" + this.name);
		
		// solange ein Thread auf die Variable counter 
		// innerhalb des synchronised Blocks zugreift,
		// kann kein anderer Thread auf diese Variable zugreifen.
		synchronized (counter) {
			for(int i = 0; i < 5; i++){
				try{
					Thread.sleep(100);
					System.out.println("Counter: " + counter);
				}
				catch (InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	
		System.out.println("Beende Thread " + this.name);
		
	}
	
}