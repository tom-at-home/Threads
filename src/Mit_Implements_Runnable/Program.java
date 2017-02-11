package Mit_Implements_Runnable;

public class Program {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			ClassImplementsRunnable cir = new ClassImplementsRunnable();

			Thread t1 = new Thread(cir);

			t1.start();
		}
	}
}