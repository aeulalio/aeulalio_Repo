package br.com.bb.gaw.dominio.celular.v1.transacoes;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.bb.gaw.dominio.celular.v1.entidades.Celular;
import br.com.bb.gaw.dominio.celular.v1.entidades.DatabaseCelular;
import br.com.bb.sos.exceptions.NegocioException;

//Transação MAINFRAME que lista um determinado Celular ou todos
@Stateless
public class TransacaoCEL1 {
	
	@Inject
	private DatabaseCelular databaseCelular;
	
	private Celular Celular;
	
	public TransacaoCEL1 executarCEL1() throws NegocioException {
		return executarCEL1(null);
	}

	public TransacaoCEL1 executarCEL1(Long codigo) throws NegocioException {
		if(codigo == null) {
			return this;
		}
		
		for(Celular c : databaseCelular.getListaCelulares()) {
			if(c.getCodigo().equals(codigo)) {
				this.Celular = c;
				return this;
			}
		}
		throw new NegocioException("Celular não localizado: " + codigo);
	}
	
	public List<Celular> getCelulares() {
		return databaseCelular.getListaCelulares();
	}

	public Celular getCelular() {
		return Celular;
	}
}