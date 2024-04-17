package sistemabancario;
import java.util.UUID;

public class Cliente {
	UUID id = UUID.randomUUID();
	String nome;
	Conta conta = new Conta(1000, TipoConta.corrente);
	
	public Cliente(String nome) {
		this.nome=nome;
	}
	
}