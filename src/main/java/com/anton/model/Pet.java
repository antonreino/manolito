package com.anton.model;

public class Pet {
	
	private int id;
	private String nombre;
	private String estado;
	private int visitas;
	private String fechaNac;
	private String propietario;
	
		
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(int id, String nombre, String estado, int visitas, String fechaNac, String propietario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.visitas = visitas;
		this.fechaNac = fechaNac;
		this.propietario = propietario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getVisitas() {
		return visitas;
	}

	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", visitas=" + visitas + ", fechaNac="
				+ fechaNac + ", propietario=" + propietario + "]";
	}
	
	
}
