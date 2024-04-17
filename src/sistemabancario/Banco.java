package sistemabancario;

public class Banco {
	public synchronized void transferir(Conta de, Conta para, double valor) {
		de.retirarSaldo(valor);
        para.adicionarSaldo(valor);
    }
}