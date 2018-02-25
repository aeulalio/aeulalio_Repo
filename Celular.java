package br.com.bb.gaw.dominio.celular.v1.entidades;

public class Celular {
	private Long codigo;
	private String nome;
	private String caracteristicas;
	private int idade;

	public Celular() {
	}

	public Celular(Long codigo, String nome, String caracteristicas, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.caracteristicas = caracteristicas;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

}
