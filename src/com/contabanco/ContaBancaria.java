package com.contabanco;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaBancaria {
	
	 private Integer numeroConta;
	 private String agencia;
	 private String nomeCliente;
	 
	 /* Recomenda-se o uso do BigDecimal para operações com valores de ponto flutuante, 
	  * devido a sua representação em base decimal que torna as operações mais precisas.
	  * */
	 private BigDecimal saldo;
	 
	public ContaBancaria() {
		this.saldo = BigDecimal.valueOf(0);
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(BigDecimal valor) {
		this.saldo = saldo.subtract(valor);
	}
	
	public void depositar(BigDecimal valor) {
		this.saldo = saldo.add(valor);
	}
	
	/**cadastra uma nova conta com  dados do terminal */
	public ContaBancaria cadastrarNovaConta(Scanner sc) throws IOException {
		ContaBancaria conta = new ContaBancaria();

		System.out.println("Por favor, digite o número da Agência !");
		conta.setAgencia(sc.next());

		System.out.println("Por favor, digite o número da Conta ! ");
		conta.setNumeroConta(sc.nextInt());

		System.out.println("Por favor, digite o seu nome ! ");
		conta.setNomeCliente(sc.next());

		System.out.println("Por favor, digite o valor depositado! ");
		conta.setSaldo(BigDecimal.valueOf(Double.valueOf(sc.next())));

		System.out.println("\n Olá ".concat(conta.getNomeCliente())
				+ ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta "
				+ conta.getNumeroConta() + "\n e seu saldo de " + conta.getSaldo() + " já está disponível para saque.");

		return conta;
	}	 
}