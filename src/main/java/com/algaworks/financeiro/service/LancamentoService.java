package com.algaworks.financeiro.service;

import java.util.Date;

import com.algaworks.financeiro.exception.NegocioException;
import com.algaworks.financeiro.model.Lancamento;
import com.algaworks.financeiro.repository.Lancamentos;

public class LancamentoService {

	private Lancamentos lancamentos;

	public LancamentoService(Lancamentos lancamentos) {
		this.lancamentos = lancamentos;
	}

	public void salvar(Lancamento lancamento) throws NegocioException {
		if (lancamento.getDataPagamento() != null && lancamento.getDataPagamento().after(new Date())) {
			throw new NegocioException("Data do pagamento não pode ser maior que a data atual.");
		}
		this.lancamentos.adicionar(lancamento);
	}

}
