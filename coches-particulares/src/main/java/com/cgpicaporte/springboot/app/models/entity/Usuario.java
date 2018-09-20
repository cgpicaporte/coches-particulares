package com.cgpicaporte.springboot.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Usuario implements Serializable {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	
	@Column(length=30, unique=true)
	private String username;
	
	@Column(length=60)
	private String password;
	
	private Boolean enabled;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private List<Role> roles;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
