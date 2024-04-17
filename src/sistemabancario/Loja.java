package sistemabancario;
import java.util.UUID;

public class Loja {
	UUID id = new UUID.randomUUID();
	String nome;
	
	public Loja(String nome) {
		this.nome=nome;
	}
	
}
