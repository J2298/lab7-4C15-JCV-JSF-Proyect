package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

	private String message = "Mensaje de Prueba";

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message + "--- Salio bien";
	}

}

