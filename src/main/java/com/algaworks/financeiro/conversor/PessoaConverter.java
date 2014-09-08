package com.algaworks.financeiro.conversor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import com.algaworks.financeiro.model.Pessoa;
import com.algaworks.financeiro.persistence.JpaUtil;
import com.algaworks.financeiro.repository.Pessoas;

@FacesConverter(forClass = Pessoa.class)
public class PessoaConverter implements Converter{
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		Pessoa retorno = null;
		EntityManager manager = JpaUtil.getEntityManager();
		try {
			if (arg2 != null) {
				Pessoas pessoas = new Pessoas(manager);
				retorno = pessoas.porId(new Long(arg2));
			}
			return retorno;
		} finally {
			manager.close();
		}

	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (arg2 != null) {
			return ((Pessoa) arg2).getId().toString();
		}
		return null;
	}
}
