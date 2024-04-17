package sistemabancario;
import java.util.UUID;

public class Loja {
	UUID id = UUID.randomUUID();
	String nome;
	Conta conta = new Conta(0, TipoConta.corrente);
	
	public Loja(String nome) {
		this.nome=nome;
	}
	
}