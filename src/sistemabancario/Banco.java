package sistemabancario;

public class Banco {
	public synchronized void transferir(Conta de, Conta para, int valor) {
		de.realizarCompra(valor);
        para.adicionarSaldo(valor);
    }
}