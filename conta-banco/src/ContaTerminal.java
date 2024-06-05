

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

	private static Scanner sc;

	public static void main(String[] args) {
		int op = 0;
		ContaBancaria conta = new ContaBancaria();

		try {
			sc = new Scanner(System.in);
			
			System.out.println("Bem-Vindo ao Banco Digital DIO! ");
			System.out.println("Por favor, escolha uma das opções ");
			System.out.println("0 - Sair                          ");
			System.out.println("1 - Cadastrar                     ");

			System.out.print("Digite uma opção: ");
			op = sc.nextInt();
			System.out.println();

			if (op == 1) {
				conta = cadastrarNovaConta(sc);

				while (op > 0) {
					System.out.println("\nPor favor, Escolha uma das opções!");
					System.out.println("1 - Sacar");
					System.out.println("2 - Depositar");
					System.out.println("0 - Sair");

					System.out.print("Digite a opção :");
					op = sc.nextInt();

					switch (op) {
					case 1:
						System.out.println("\nDigite o valor a ser Sacado ");
						BigDecimal valorSaque = BigDecimal.valueOf(Double.valueOf(sc.next()));

						/* Verificando se o valor sacado é menor ou igual ao saldo disponivel */
						if (valorSaque != null && (valorSaque.compareTo(conta.getSaldo()) == -1
								|| valorSaque.compareTo(conta.getSaldo()) == 0))
							conta.sacar(valorSaque);
						else
							System.out.println("\nValor maior que o saldo disponivel!");

						System.out.println("\nSaldo disponivel : " + conta.getSaldo());

						break;
					case 2:
						System.out.println("\nDigite o valor a ser depositado ");
						conta.depositar(BigDecimal.valueOf(Double.valueOf(sc.next())));
						System.out.println("\nSaldo disponivel : " + conta.getSaldo());

						break;

					}
				}
			}

		} catch (Exception e) {
			System.out.println("Um erro ocorreu ao processar as informações. Tente novamente!");
			e.printStackTrace();

		} finally {
			sc.close();
			System.out.println("Programa encerrado...");

		}

	}
	
	/**cadastra uma nova conta com  dados do terminal */
	public static ContaBancaria cadastrarNovaConta(Scanner sc) throws IOException {
		ContaBancaria conta = new ContaBancaria();

		System.out.println("Por favor, digite o número da Agência !");
		conta.setAgencia(sc.next());

		System.out.println("Por favor, digite o número da Conta ! ");
		conta.setNumeroConta(sc.nextInt());

		System.out.println("Por favor, digite o seu nome ! ");
		String nomeCliente = sc.nextLine();
		conta.setNomeCliente(nomeCliente);

		System.out.println("Por favor, digite o valor depositado! ");
		conta.setSaldo(BigDecimal.valueOf(Double.valueOf(sc.next())));
		
		System.out.println("\n Olá ".concat(conta.getNomeCliente())
				+ ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
				+ conta.getNumeroConta() + "\n e seu saldo de " + conta.getSaldo() + " já está disponível para saque.");

		return conta;
	}	

}