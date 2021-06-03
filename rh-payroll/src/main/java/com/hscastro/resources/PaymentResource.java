package com.hscastro.resources;

import java.util.List;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
//import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hscastro.model.Payment;
import com.hscastro.model.Worker;
import com.hscastro.services.PaymentService;



@RequestScoped
@Path("/payments")
public class PaymentResource {
	
	@Inject
	private PaymentService paymentService;

	@GET
	@Path("{workerId}/days/{days}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)	
	public Response getPayment(@PathParam("workerId") Long workerId, 
			@PathParam("days") Integer days){		
		Payment payment = paymentService.getPayment(workerId, days);		
		return Response.ok(payment).build();		
	}
	
	
	@GET	
	@Path("{id}")		
	@Produces(MediaType.APPLICATION_JSON)
	public Worker findById(@PathParam("id") Long id) {
		Worker worker = paymentService.getWorker(id);		
		return worker;
	}	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getPayments(){
		List<Worker> lista = paymentService.getPayments();
		return Response.ok(lista).build();		
	}	
	
	
	@GET
	@Path("test")	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response getTest() {
		return Response.ok("Hello microporfile").build();
	}

	
}
