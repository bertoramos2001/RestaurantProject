
package Negocio.Menu;

public class TMenu {

	private Integer id_menu;
	private Boolean activo;
	private String nombre;
	private Float precio;
	private Integer stock;
	
	public TMenu(Integer id_menu, Boolean activo, String nombre, Float precio, Integer stock) {
		this.id_menu = id_menu;
		this.activo = activo;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public TMenu() {
	}

	//Getters
	public Integer getId() {
		return id_menu;
	}

	public Boolean getActivo() {
		return activo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Float getPrecio() {
		return precio;
	}
	
	public Integer getStock() {
		return stock;
	}
	
	//Setters
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public void setId(Integer id) {
		this.id_menu = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public void setStock(Integer stock) {
		this.stock = stock;	
	}

}