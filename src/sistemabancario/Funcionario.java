package sistemabancario;
import java.util.UUID;

public class Funcionario extends Thread {
	UUID id = UUID.randomUUID();
	String nome;
	Conta contaSalario = new Conta(0, TipoConta.corrente);
	Conta contaInvestimento = new Conta(0, TipoConta.investimento);
	Loja loja;
	
	public Funcionario(String nome) {
		this.nome=nome;
	}
	
	public void run() {
		if(contaSalario.saldo >= 1400) {
			contaInvestimento.adicionarSaldo(contaSalario.saldo * 0.2);
			contaSalario.retirarSaldo(contaSalario.saldo * 0.2);
		}
		
		if(loja.conta.saldo >= 1400) {
			loja.pagarFuncionario(this);
		}
	}
}