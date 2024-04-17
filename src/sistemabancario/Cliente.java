package sistemabancario;
import java.util.UUID;

public class Cliente {
	UUID id = new UUID.randomUUID();
	String nome;
	
	public Cliente(String nome) {
		this.nome=nome;
	}
	
}