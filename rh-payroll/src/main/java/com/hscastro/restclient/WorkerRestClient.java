package com.hscastro.restclient;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.hscastro.model.Worker;


@Path("workers")
@RegisterRestClient
public interface WorkerRestClient {
	
	@GET		
	@Path("/{id}")
	Worker findById(@PathParam("id") Long id);
	
	@GET				
	List<Worker> findAll();
	
}
