package sistemabancario;
import java.util.UUID;

public class Cliente extends Thread {
	UUID id = UUID.randomUUID();
	String nome;
	Conta conta = new Conta(1000, TipoConta.corrente);
	
	public Cliente(String nome) {
		this.nome=nome;
	}
	
	public void run() {
		
	}
}