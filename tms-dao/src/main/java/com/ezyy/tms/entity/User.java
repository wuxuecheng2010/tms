package com.ezyy.tms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1952311846235416210L;
	
	private Integer uid;
	private String username;
	private String password;
	//private Set<Role> roles;
	

}
