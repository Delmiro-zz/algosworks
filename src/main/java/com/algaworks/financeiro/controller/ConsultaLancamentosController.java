package com.algaworks.financeiro.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.algaworks.financeiro.model.Lancamento;
import com.algaworks.financeiro.persistence.JpaUtil;
import com.algaworks.financeiro.repository.Lancamentos;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosController {

	private List<Lancamento> lancamentos;

	public void consultar() {
		EntityManager manager = JpaUtil.getEntityManager();
		Lancamentos lancamentos = new Lancamentos(manager);
		this.lancamentos = lancamentos.listar();
		manager.close();
	}

	public List<Lancamento> getlLancamentos() {
		return lancamentos;
	}
	
	
}
