package sistemabancario;
import java.util.UUID;

public class Funcionario extends Thread {
	UUID id = UUID.randomUUID();
	String nome;
	Conta contaSalario = new Conta(0, TipoConta.corrente);
	Conta contaInvestimento = new Conta(0, TipoConta.investimento);
	
	public Funcionario(String nome) {
		this.nome=nome;
	}
	
	public void run() {
		
	}
}