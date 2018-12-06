package com.ezyy.tms.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer rid;
	private String rname;
	private Set<User> users=new HashSet<>();
	private Set<Module> modules=new HashSet<>();
	
}
