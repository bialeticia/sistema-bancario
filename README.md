# Sistema Bancário

Este projeto representa um sistema bancário utilizando threads e conceitos. O sistema intermedia as transações de forma síncrona e coordenada, garantindo a consistência dos saldos das contas.

## Funcionalidades

- **Banco**: Coordena todas as transações entre as contas, garantindo a sincronização e consistência dos dados.
- **Lojas**: Cada loja gerencia suas vendas e realiza o pagamento dos salários dos funcionários quando o saldo em conta permite.
- **Funcionários**: Representados por threads que recebem salários e investem parte deste em uma conta de investimentos.
- **Clientes**: Cada cliente é representado como uma thread que realiza compras em lojas até que o saldo de sua conta esteja vazio.

## Tecnologia Utilizada

- **Java 17**: Linguagem de programação utilizada para desenvolver o sistema.

## Estrutura

O projeto é dividido em várias classes, cada uma representando diferentes componentes do sistema:
- `Banco.java`: Contém lógicas de transferência e operações bancárias.
- `Conta.java`: Representa uma conta bancária e contém métodos para depósito e retirada.
- `Cliente.java`: Thread que simula o comportamento de compras de um cliente.
- `Loja.java`: Gerencia transações de venda e pagamento de funcionários.
- `Funcionario.java`: Thread que simula um funcionário recebendo pagamentos e fazendo investimentos.
- `SincronizarPrints.java`: Classe auxiliar para logar as operações de forma sincronizada.
- `TipoConta.java`: Define os tipos possíveis de contas.
