package Negocio.Mesa;


public class TMesa {
	
	private Integer id_mesa;
	private Integer num_mesa;
	private Integer capacidad;
	private Boolean disponibilidad;
	private Boolean activo;



	public Integer getId() {
		return id_mesa;
	}

	
	public Integer getNumMesa() {
		return num_mesa;
	}

	
	public Integer getCapacidad() {
		return capacidad;
	}

	
	public Boolean getDisponibilidad() {
		return disponibilidad;
	}

	
	public Boolean getActivo() {
		return activo;
	}

	
	
	public void setId(Integer id) {
		this.id_mesa = id;
	}

	
	public void setNumMesa(Integer numMesa) {
		this.num_mesa = numMesa;
	}

	
	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	
	public void setDisponibilidad(Boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	
	
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public TMesa(Integer num, Boolean activo, Integer capacidad, Boolean disponibilidad) {
		this.num_mesa = num;
		this.activo = activo;
		this.capacidad = capacidad;
		this.disponibilidad = disponibilidad;
	}
	
	public TMesa(Integer id, Integer num, Boolean activo, Integer capacidad, Boolean disponibilidad) {
		this.id_mesa = id;
		this.num_mesa = num;
		this.activo = activo;
		this.capacidad = capacidad;
		this.disponibilidad = disponibilidad;
	}


	public TMesa() {
	}
}