package com.hscastro.converters;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.spi.Converter;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.hscastro.model.Worker;
import com.hscastro.restclient.WorkerRestClient;

@ApplicationScoped
public class ConverterWorker implements Converter<Worker> {

	private static final long serialVersionUID = 201967607866212020L;
	
	@Inject
	@RestClient
	private WorkerRestClient workerRestClient;
	
	@Override
	public Worker convert(String value) {
		
		if(value.isEmpty()) {
			return null;
		}
		
		Long id = Long.valueOf(value);
		Worker worker = workerRestClient.findById(id);
		
		return worker;
	}
	
}
