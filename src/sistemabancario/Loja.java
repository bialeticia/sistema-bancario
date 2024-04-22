package sistemabancario;
import java.util.List;
import java.util.UUID;

public class Loja {
    UUID id = UUID.randomUUID();
    Conta conta = new Conta(0, TipoConta.corrente);
    double salarioNecessario = 2800;
    String nome;
    Banco banco;
    List<Funcionario> funcionarios;

    public Loja(String nome, Banco banco, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.banco = banco;
        this.funcionarios = funcionarios;
    }

    public void processarCompra(Cliente cliente, double valor) {
        banco.transferir(cliente.conta, this.conta, valor);
        verificarPagamentoFuncionarios();
        SincronizarPrints.log(nome + ": Recebe o valor de R$ " + valor);
        SincronizarPrints.log(nome + ": Novo saldo R$ " + conta.saldo);
    }

    private synchronized void verificarPagamentoFuncionarios() {
        if (conta.saldo >= salarioNecessario) {
            for (Funcionario funcionario : funcionarios) {
                banco.transferir(this.conta, funcionario.contaSalario, 1400);
                funcionario.recebeuSalario = true;
                SincronizarPrints.log(funcionario.nome + " recebe " + 1400);
                SincronizarPrints.log("Novo saldo da loja: " + conta.saldo);
                SincronizarPrints.log("Novo saldo do funcionário: " + funcionario.contaSalario.saldo);
            }
        }
    }
}