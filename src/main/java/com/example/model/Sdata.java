package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sdata {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private Long snumber;

	public Sdata() {
	}

	public Sdata(String name, Long snumber) {
		this.name = name;
		this.snumber = snumber;
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

	public Long getSnumber() {
		return snumber;
	}

	public void setSnumber(Long snumber) {
		this.snumber = snumber;
	}

	@Override
	public String toString() {
		return "Sdata [id=" + id + ", name=" + name + ", snumber=" + snumber + "]";
	}

}
