package sistemabancario;
import java.util.UUID;

public class Funcionario {
	UUID id = new UUID.randomUUID();
	String nome;
	
	public Funcionario(String nome) {
		this.nome=nome;
	}
	
}