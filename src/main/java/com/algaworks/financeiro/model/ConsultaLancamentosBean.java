package com.algaworks.financeiro.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.algaworks.financeiro.persistence.JpaUtil;
import com.algaworks.financeiro.repository.Lancamentos;

@ManagedBean
@ViewScoped
public class ConsultaLancamentosBean {

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
