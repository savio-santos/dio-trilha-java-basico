import java.util.Scanner;

public class Simulacao {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        double saldo = 0;
	        boolean continuar = true;
	        double valor = 0;
	        while (continuar) {

	            int opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
	                      valor = scanner.nextDouble();
	                      saldo+=valor;
	                      System.out.println("Saldo atual: "+saldo);
	                      break;
	                case 2:
	                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
	                        valor = scanner.nextDouble();
	                       if(valor <= saldo)
	                          saldo-=valor;
	                        else
	                          System.out.println("Saldo insufuciente.");

	                    break;
	                case 3:
	                    // TODO: Exibir o saldo atual da conta.
	                     System.out.println("Saldo atual: "+saldo);

	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        }
	        scanner.close();
	    }

	}