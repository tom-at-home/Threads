package Mit_Implements_Runnable;

public class ClassImplementsRunnable implements Runnable {

	@Override
	public void run() {

		long l = 0;
		long anfang = System.currentTimeMillis();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 500000000; j++) {
				l++;
			}
			System.out.println("Berechne! " + i + "%");
		}
		System.out.println("Fertig!");
		long ende = System.currentTimeMillis();
		long diff = ende - anfang;
		System.out.println(diff);
	}

}