package com.algaworks.financeiro.persistence;

import javax.persistence.Persistence;

public class CreateTable {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("FinanceiroPU");
		System.out.println("Tabela Criada com sucesso!");
	}
}
