package br.com.bb.gaw.dominio.celular.v1.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DatabaseCelular {
	
	private List<Celular> listaCelulares;
	
	public DatabaseCelular() {
		listaCelulares = new ArrayList<Celular>();
		
		listaCelulares.add(new Celular(1L, "iPhone 5C", "8GB Branco", 1));
		listaCelulares.add(new Celular(2L, "Motorolla Xoom", "124GB Preto - Wi-Fi", 5));
		listaCelulares.add(new Celular(3L, "Galaxy S6", "32GB Wi-Fi", 5));
		listaCelulares.add(new Celular(4L, "Xperia S", "16GB resistente a água", 2));		
	}

	public List<Celular> getListaCelulares() {
		return listaCelulares;
	}

	public void setListaCelulares(List<Celular> listaCelulares) {
		this.listaCelulares = listaCelulares;
	}

}
