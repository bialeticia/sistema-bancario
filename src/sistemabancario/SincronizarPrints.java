package sistemabancario;

public class SincronizarPrints {
	private static final Object lock = new Object();

    public static void log(String message) {
        synchronized (lock) {
            System.out.println(message);
        }
    }
}