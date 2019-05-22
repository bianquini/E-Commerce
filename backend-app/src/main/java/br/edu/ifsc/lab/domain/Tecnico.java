package br.edu.ifsc.lab.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Tecnico extends Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private Float salario;
	//private List<Orcamento> orcamentos = new ArrayList<>();
	//private List<Servico> servicos = new ArrayList<>();
	
	public Tecnico() {
		
	}
	
	public Tecnico(Float salario) {
		super();
		this.salario = salario;
	}



	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	/*public List<Orcamento> getOrcamentos() {
		return orcamentos;
	}
	public void setOrcamentos(List<Orcamento> orcamentos) {
		this.orcamentos = orcamentos;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}*/
	
	
}
