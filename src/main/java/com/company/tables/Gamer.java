package com.company.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Gamers")
public class Gamer {
	
	@Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name= "Login")
	private String login;
	
	@Column(name= "Password")
	private String password;
	
	public Gamer(){};
	public Gamer(String login, String password){
		this.login = login;
		this.password = password;
	};


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	
}