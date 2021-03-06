package com.hscastro.entities;

import java.io.Serializable;


//@Entity
//@Table(name = "workers")
//@NamedQueries({
//	@NamedQuery(name = "Worker.findAll", query = "SELECT w worker FROM w")
//})
public class Worker implements Serializable {

	private static final long serialVersionUID = 2172297189413682064L;
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	

	private Double dayleIncome;
	
	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public Worker(Long id, String name, Double dayleIncome) {		
		this.id = id;
		this.name = name;
		this.dayleIncome = dayleIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDayleIncome() {
		return dayleIncome;
	}

	public void setDayleIncome(Double dayleIncome) {
		this.dayleIncome = dayleIncome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	}
