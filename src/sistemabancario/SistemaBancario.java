package sistemabancario;
import java.util.List;
import java.util.ArrayList;

public class SistemaBancario {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Funcionario[] funcionarios = new Funcionario[4];
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = new Funcionario("Funcionário " + i, banco);
        }
        
        List<Funcionario> listaDeFuncionarios1 = new ArrayList<>();
        listaDeFuncionarios1.add(funcionarios[0]);
        listaDeFuncionarios1.add(funcionarios[1]);
        List<Funcionario> listaDeFuncionarios2 = new ArrayList<>();
        listaDeFuncionarios2.add(funcionarios[2]);
        listaDeFuncionarios2.add(funcionarios[3]);
        Loja lojaUm = new Loja("Loja 1", banco, listaDeFuncionarios1);
        Loja lojaDois = new Loja("Loja 2", banco, listaDeFuncionarios2);
        
        Cliente[] clientes = new Cliente[5];
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Cliente("Cliente" + i, lojaUm, lojaDois);
        }
        
        for (Funcionario funcionario : funcionarios) {
        	funcionario.start();
        }
        
        for (Cliente cliente : clientes) {
            cliente.start();
        }

        for (Cliente cliente : clientes) {
            try {
                cliente.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        for (Funcionario funcionario : funcionarios) {
            try {
            	funcionario.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Saldo final da Loja 1: " + lojaUm.conta.saldo);
        System.out.println("Saldo final da Loja 2: " + lojaDois.conta.saldo);
        
        for (Funcionario funcionario : funcionarios) {
        	System.out.println("Saldo final de Investimento" + funcionario.nome + ": " + funcionario.contaInvestimento.saldo);
        }       
    }
}