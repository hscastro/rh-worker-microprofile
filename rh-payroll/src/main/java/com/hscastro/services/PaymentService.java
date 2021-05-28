package com.hscastro.services;

import java.util.List;

import com.hscastro.model.Payment;
import com.hscastro.model.Worker;


public interface PaymentService {
				
	
	Payment getPayment(Long workerId, Integer days);
	
	Worker getWorker(Long id);
	
	List<Worker> getPayments();
		
}
