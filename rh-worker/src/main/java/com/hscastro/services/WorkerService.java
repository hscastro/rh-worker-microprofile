package com.hscastro.services;

import java.util.List;

import com.hscastro.entities.Worker;

public interface WorkerService {

	void save(Worker worker);	
	Worker findByName(String nome);
	Worker findById(Long id);
	Worker update(Long id, Worker w);
	List<Worker> findAll();
	void delete(Long id);
	
}
