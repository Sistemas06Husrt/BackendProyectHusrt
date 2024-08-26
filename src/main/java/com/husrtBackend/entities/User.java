package com.husrtBackend.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private Long id_Usuario;
	
	@Column(name = "nombre")
	private String Nombre;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	 

	public Long getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
