package br.com.bb.gaw.dominio.celular.v1.resources;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.bb.gaw.dominio.celular.v1.entidades.Celular;
import br.com.bb.gaw.dominio.celular.v1.gateways.GatewayCelular;
import br.com.bb.sos.api.ServiceResponse;
import br.com.bb.sos.exceptions.NegocioException;

@Stateless
@Path("/v1/celulares")
public class CelularesResource {
	
	/*
	Chamadas de Exemplo:
		http://localhost:8080/dia3/api/v1/celulares
	*/

	@Inject
	private GatewayCelular	gatewayCelular;

	@GET
	@Produces(MediaType.APPLICATION_JSON + ";chareset=UTF-8")
	public Response buscarCelulares() throws NegocioException {
		return Response.ok().entity(new ServiceResponse<List<Celular>>(gatewayCelular.buscarCelulares())).build();
	}
	
	@GET
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON + ";chareset=UTF-8")
	public Response buscarCelularPorMci(@PathParam("codigo") Long codigo) throws NegocioException {
		return Response.ok().entity(new ServiceResponse<Celular>(gatewayCelular.buscarCelular(codigo))).build();
	}
}
