package Negocio.Ingrediente;

public class TIngrediente {

	private Integer id_ingrediente;
	private String nombre;
	private Boolean alergeno;
	private Boolean activo;

	public int getId() {
		return id_ingrediente;
	}

	public String getNombre() {
		return nombre;
	}

	public Boolean getAlergeno() {
		return alergeno;
	}

	public Boolean getActivo() {
		return activo;
	}
	
	public void setId(int id) {
		this.id_ingrediente = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAlergeno(Boolean alergeno) {
		this.alergeno = alergeno;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public TIngrediente(Integer id, Boolean alergeno, String nombre, Boolean activo) {
		this.id_ingrediente = id;
		this.nombre = nombre;
		this.alergeno = alergeno;
		this.activo = activo;
	}
	
	public TIngrediente() {
		
	}
	
	public TIngrediente(Boolean alergeno, String nombre, Boolean activo) {
		this.nombre = nombre;
		this.alergeno = alergeno;
		this.activo = activo;
	}

}