package com.ezyy.tms.entity;

import java.util.Set;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Module {
	private Integer mid;
	private String mname;
	private Set<Role> roles;
	

}
