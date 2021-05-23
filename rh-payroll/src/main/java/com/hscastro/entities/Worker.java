package com.hscastro.entities;


public class Worker {

	
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
		result = prime * result + ((dayleIncome == null) ? 0 : dayleIncome.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (dayleIncome == null) {
			if (other.dayleIncome != null)
				return false;
		} else if (!dayleIncome.equals(other.dayleIncome))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", name=" + name + ", dayleIncome=" + dayleIncome + "]";
	}
	
}
