package Negocio.Producto;

public class TProducto {
	private Integer id_producto;
	private Boolean activo;
	private String nombre;

	public TProducto(Integer id, Boolean activo, String nombre) {
		id_producto = id;
		this.activo = activo;
		this.nombre = nombre;
	}

	public TProducto(Boolean activo, String nombre) {
		this.activo = activo;
		this.nombre = nombre;
	}
	
	public TProducto() {
	}

	public Integer getId() {
		return id_producto;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setId(Integer id) {
		id_producto = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}