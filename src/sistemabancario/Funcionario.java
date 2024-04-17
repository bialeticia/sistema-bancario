package sistemabancario;
import java.util.UUID;

public class Funcionario extends Thread {
	UUID id = UUID.randomUUID();
	String nome;
	Conta contaSalario = new Conta(0, TipoConta.corrente);
	Conta contaInvestimento = new Conta(0, TipoConta.investimento);
	Banco banco;
	boolean recebeuSalario = false;
	
	public Funcionario(String nome, Banco banco) {
		this.nome = nome;
		this.banco = banco;
	}
	
	public void run() {
		while (true) {
            try {
                Thread.sleep(1000);
                double salario = contaSalario.saldo;
                if (salario > 0 && recebeuSalario) {
                    double investimento = salario * 0.2;
                    banco.transferir(contaSalario, contaInvestimento, investimento);
                    recebeuSalario = false;
                    SincronizarPrints.log(nome + " transferiu para investimento o valor " + investimento);
                }
            } 
            
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}