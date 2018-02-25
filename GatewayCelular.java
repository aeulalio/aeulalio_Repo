package br.com.bb.gaw.dominio.celular.v1.gateways;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.bb.gaw.dominio.celular.v1.entidades.Celular;
import br.com.bb.gaw.dominio.celular.v1.transacoes.TransacaoCEL1;
import br.com.bb.sos.exceptions.NegocioException;

@Stateless
public class GatewayCelular {

	@Inject
	private TransacaoCEL1	transacaoCEL1;
	
	public List<Celular> buscarCelulares() throws NegocioException {
		return transacaoCEL1.executarCEL1().getCelulares();
	}

	public Celular buscarCelular(Long codigo) throws NegocioException {
		return transacaoCEL1.executarCEL1(codigo).getCelular();
	}
}
