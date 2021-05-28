package com.hscastro.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hscastro.model.Payment;
import com.hscastro.model.Worker;
import com.hscastro.restclient.WorkerRestClient;

@ApplicationScoped
public class PaymentServiceImpl implements PaymentService {
		
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

	@Override
	public Worker getWorker(Long id) {
		Worker worker = workerRestClient.findById(id);			
		return worker;
	}
	
	public List<Worker> getPayments() {		
		List<Worker> list = workerRestClient.findAll();		
		return list;		
	}	
		
}
