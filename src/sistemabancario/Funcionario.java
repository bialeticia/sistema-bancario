package sistemabancario;
import java.util.UUID;

public class Funcionario {
	UUID id = UUID.randomUUID();
	String nome;
	Conta contaSalario = new Conta(0);
	Conta contaInvestimento = new Conta(0);
	
	public Funcionario(String nome) {
		this.nome=nome;
	}
	
}