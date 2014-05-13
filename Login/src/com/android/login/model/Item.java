package com.android.login.model;

public class Item {
	private String titulo;
	private int imagen;
	
	public Item(int imagen, String titulo) {
		this.titulo = titulo;
		this.imagen = imagen;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getImagen() {
		return imagen;
	}

	public void setImagen(int imagen) {
		this.imagen = imagen;
	}

}
