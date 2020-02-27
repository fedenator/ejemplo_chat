package org.fpalacios.chatserver.modelos;

public class MensajeDTO
{
	private String nombre;
	private String contenido;

	public MensajeDTO(String nombre, String contenido)
	{
		this.nombre = nombre;
		this.contenido = contenido;
	}

	public String getNombre()
	{
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
}
