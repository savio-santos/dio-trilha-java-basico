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
	
 
}