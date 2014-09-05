package com.algaworks.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraBean {

	private Integer valorA;
	private Integer valorB;
	private Integer resultado;

	public void somar() {
		this.resultado = this.valorA + this.valorB;
	}

	public Integer getValorA() {
		return valorA;
	}

	public void setValorA(Integer valorA) {
		this.valorA = valorA;
	}

	public Integer getValorB() {
		return valorB;
	}

	public void setValorB(Integer valorB) {
		this.valorB = valorB;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	


}
