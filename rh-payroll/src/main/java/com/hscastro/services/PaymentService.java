package com.hscastro.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hscastro.entities.Payment;
import com.hscastro.entities.Worker;
import com.hscastro.restclient.WorkerRestClient;

@ApplicationScoped
public class PaymentService {
		
	@Inject
	@RestClient
	private WorkerRestClient workerRestClient;
	
	
	public Payment getPayment(Long workerId, Integer days) {
		System.out.println("test 2-1");
		@SuppressWarnings("unused")
		Worker worker = workerRestClient.findById(workerId);		
		System.out.println("test 2-2");
		return new Payment("Bob", 200.00, days);
		//return new Payment(worker.getName(), worker.getDayleIncome(), days);
	}

	public List<Worker> getPayments() {		
		List<Worker> list = workerRestClient.findAll();		
		return list;		
	}	
		
}
