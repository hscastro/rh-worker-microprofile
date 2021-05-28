package com.hscastro.services;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.hscastro.entities.Worker;

@ApplicationScoped
public class WorkerServiceImpl implements WorkerService {

	private List<Worker> list = new ArrayList<Worker>();
	
//	 @PersistenceContext(unitName = "microprofile_PU")
//	 private EntityManager em;
	
	public WorkerServiceImpl() {
		Worker w1 = new Worker(1L, "Bob", 2800.00);		
		Worker w2 = new Worker(2L, "John", 320.00);
		list.add(w1);
		list.add(w2);
	}
	
	@Override
	public void save(Worker worker) {
		//em.persist(worker);	
		Worker novo = new Worker();
		novo.setId(worker.getId());
		novo.setName(worker.getName());
		novo.setDayleIncome(worker.getDayleIncome());
		
		if(list.isEmpty()) {
			list.add(novo);	
			
		}else {
			int index = list.size();
			list.add(index, novo);
		}		
			
	}

	@Override
	public Worker findById(Long id) {		
		Long entityID = 0L;
		System.out.println("CAIXA ALTA - 0");
		
		for (int i = 0; i < list.size(); i++) {
			Worker worker = list.get(i);
			 entityID = worker.getId().longValue();			 		 
			 
			 if(entityID.equals(id)) {				
				 return worker;
			 }
		}
		
		return null;
	}

	@Override
	public List<Worker> findAll() {
		return list;
	}

	@Override
	public void delete(Long id) {
		Worker worker = findById(id);
		
		if(worker != null) {
			//em.remove(worker);
		}		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Worker update(Long id, Worker w) {
		Worker obj = null;
		
		if(list.contains(id)) {
			int id_ = id.intValue();
			obj = list.get(id_);			
			obj.setId(w.getId());
			obj.setName(w.getName());
			obj.setDayleIncome(w.getDayleIncome());
			list.remove(id_);
			list.add(id_, obj);
		}
		
		return obj;
	}


}
