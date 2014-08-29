package com.algaworks.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NomesBean {

	private String nome;
	private List<String> nomes = new ArrayList<>();

	public String adicionar() {
		this.nomes.add(nome);
		if(this.nomes.size() > 3 ){
			return "Ola";
		}
		return "Ola?faces-redirect=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

}
