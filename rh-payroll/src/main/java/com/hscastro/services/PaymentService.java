package com.hscastro.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hscastro.entities.Payment;
import com.hscastro.entities.Worker;
import com.hscastro.restclient.WorkerRestClient;

@ApplicationScoped
public class PaymentService {
		
	@Inject
	@RestClient
	private WorkerRestClient workerRestClient;
	
	
	public Payment getPayment(@PathParam("workerId") long workerId, @PathParam("days") int days) {
		
		Worker worker = workerRestClient.findById(workerId);		
		return new Payment(worker.getName(), worker.getDayleIncome(), days);
	}

}