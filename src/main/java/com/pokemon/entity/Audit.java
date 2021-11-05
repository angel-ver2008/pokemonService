package com.pokemon.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Audit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String ip;
	
	@Column(name="method_executed")
	private String executedMethod;
	
	@Column(name="request_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date requestDate;
	
	
}
