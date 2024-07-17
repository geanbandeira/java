package com.ifsp;

public class cliente {
	private int idCliente;
	private String cpf;
	private Contato cont;
	
	
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", cont=" + cont + ", email=" + email + "]";
	}

	private String email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
