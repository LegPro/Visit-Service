package com.infoway.petclinic.model;



import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
@Entity
public class Visit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;

	@Column(name = "DATE")
	Date date;
	@Column(name = "DESCRIPTION")
    @NotEmpty
	String description;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Visit() {
		super();
	}
	@Override
	public String toString() {
		return "Visit [id=" + id + ", date=" + date + ", description=" + description + "]";
	}
	
	
	
}
