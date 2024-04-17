package sistemabancario;
import java.util.UUID;

public class Loja {
	UUID id = UUID.randomUUID();
	String nome;
	Conta conta = new Conta(0, TipoConta.corrente);
	
	public Loja(String nome) {
		this.nome=nome;
	}
	
	public void processarCompra(Cliente cliente, double valor) {
        Banco banco = new Banco();
        banco.transferir(cliente.conta, this.conta, valor);
    }
	
	public void pagarFuncionario(Funcionario funcionario) {
        Banco banco = new Banco();
        banco.transferir(funcionario.contaSalario, this.conta, 1400);
    }
	
}